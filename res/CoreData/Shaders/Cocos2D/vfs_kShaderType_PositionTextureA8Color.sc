�GSN    �/ue��|G��g�6�j�s��T���Sv�z�,q��)K�Hg���f�]���m�ֹ'{"Ѧ�U���)j��KD��I���,1f9������o�tv�`h^����)*�V���	u���������)��^�z����b�V�����I��0��$�l�݆[�9x_�6Sy%���婖�VS��ו�X<�1���Ǭ	CݓL|H�2҄X�5���T���<!���޺�d��ԲNJ[�;W-���n��?H�yx���L��&jL��;X�]H4:���_I�}C����sW��8o\�܁��obp	����N_�e�ֱ�5�����z8��U�O���.wQ3�M�#�xmm��6Ck�<��s�H�/��uK���j]�.�C�#�xz��x�Z<��l�d�f�n -&�nv�U����9%��\R����Ϯ1j���Vۢxhm�Ԃm�]mg�N׌7�Qy�;7+j�oE�F���`�2L�>N^�ω����]��Q�3X���rix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
    v_texCoord = a_texcoord0;
    v_fragmentColor = a_color0;
}


#endif
#ifdef FS
$input v_texCoord, v_fragmentColor

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4�CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform@mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

zAMPLER2D (CC_Texture0,0);




void main()
{
     gl_FragColor = vec4( v_fragmentColor.rgb,v_fragmentColor.a) * texture2D�CC_Texture0, v_texCoord).a ;
}



#endif
