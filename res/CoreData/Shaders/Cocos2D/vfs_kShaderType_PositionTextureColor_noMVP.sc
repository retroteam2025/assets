�GSN    �/ue��|G��g�6�j�s��T���Sv�z�,q��)K�Hg���f�]���m�ֹ'{"Ѵ�q���FRp���
U���E���1'f9������o�tv�`h^����)*�V���	u���������)��^�z����b�V�����I��0��$�l�݆[�9x_�6Sy%���婖�VS��ו�X<�1���Ǭ	CݓL|H�2҄X�5���T���<!���޺�d��ԲNJ[�;W-���n��?H�yx���L��&jL��;X�]H4:���_I�}C����sW��8o\�܁��obp	����N_�e�ֱ�5�����z8��U�O���.wQ3�M�#�xmm��6Ck�<��s�H�/��uK���j]�.�C�#�xz��x�Z<��l�d�f�n -&�nv�U����9%��\R����Ϯ1j���Vۢxhm�Ԃm�]mg�N׌7�Qy�;7+j�oE�F���`�2L�>N^�ω��M��J�.E↞%��, vec4(a_position.xyz,1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}


#endif

#ifdef FS

$incut v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPM�trix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_Normal-atrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (CC_TLxture0,0);



void main()
{
    vec4 color = v_fragmentColor * texture2D(CC_Texture0,v_texCoord.xy);
    gl_FragColor = �olor;
//    gl_FragColor = vec4(v_texCoord.x,v_texCoord.y,0.0,1.0);
}


#endif
