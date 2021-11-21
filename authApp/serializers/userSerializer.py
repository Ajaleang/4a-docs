from rest_framework import serializers
from authApp.models.user import User


class UserSerializer(serializers.ModelSerializer):
    class Meta:
        model = User
        fields = ['id', 'username', 'password', 'name', 'email','document','tipo_documento' ]

    def create(self, validated_data):
        user = User(
            username=validated_data['username'],
            name=validated_data['name'],
            email=validated_data['email'],
            document=validated_data['document'],
            tipo_documento=validated_data['tipo_documento'],
        )
        user.set_password(validated_data['password'])
        user.save()
        return user
    
    def to_representation(self, instance):
        return {
            'id': instance.id,
            'username': instance.username,
            'name': instance.name,
            'email': instance.email,
            'document': instance.document,
            'tipo_documento': instance.tipo_documento,
        }

        
    
                