�GSN    �/ue��|G��g�6�j�s��T���Sv�z�,q��)K�Hg�3��p�G���8��ێ =?Y�߽q���jOq���^���b���71j������f�k;��u(J����
r� ѭ8o�������g�"�0F�c���V�D�=������0��$�l�݆[�9x_�6Sy8-������)H�
�ʊ�0�q���۾,b
��La�n��P�.��D2_4�b&���"8������q��=ϲJSl�R���
��#L�{a���lج
[~��\�"+9o���CM�dT��M؂$��3RX�����te ���P�HDK�e�ʍ����$���u1���\���MwM>�L��%9m��N'!�-��a��!ʉfp���wI�]�=�7J�|y��o�X#�B�c�d��(�;s=V�fl�I���@]��9���ێ�d#���9�� 'T �ǜ[�	�Hц7�b�:WT}�:U6�V���e,�2J�20=)�������P���2m���-��osition.xyz,1.0));
    v_texCoord = a_texcoord0;
}


#endif

#ifdef FS
$input v_texCoord

#include "../Library/Base/c|mmon.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatri�;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
unifrm vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);




void main()
{
    gl_FragColor = texturL2D(CC_Texture0, v_texCoord);
//    gl_FragColor = vec4(v_texCoord.x,v_texCoord.y,0.0,1.0);
}



#endif
