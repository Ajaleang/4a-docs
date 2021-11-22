from rest_framework import serializers
from authApp.models.user import User


class UserSerializer(serializers.ModelSerializer):
    class Meta:
        model = User
        fields = ['id', 'name', 'tipo_documento', 'document', 'email','username','password' ]

    """def create(self, validated_data):
        return User.objects.create(**validated_data)
        
    
    def to_representation(self, instance):
        return {
            'id': instance.id,
            'name': instance.name,
            'tipo_documento': instance.tipo_documento,
            'document': instance.document,
            'email': instance.email,
            'username': instance.username,
            'password': instance.password,
            """


        
    
                