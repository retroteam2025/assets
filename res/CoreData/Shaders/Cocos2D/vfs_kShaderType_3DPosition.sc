�GSN    �/ue��|G��g�6�j�s��T���Sv�z�,q��>G���&s�L��p�D�������bX5=��6����%~_�²KW������-*}F�ꑩ��)�ED��mh��З)*�V���(G���;���h�p�h�C����g�c�fʮ����P��+�J#���{�t9h� fej������P�ⅻ�j�i����*X.�Qv�c��
�2�� T�z)������ɠ�^��ҩ_	�I��j��(F�4'O���b��DT��V�B:d֩�rc�AX����|z߳	RS��׹�o-O���e�X$�C���5���D4���'~��g�X��c#W�(�}�|f5Å'H"�O`��l�Y�}��hx���f_�r� �kA�q��r�A`��d�"]�>�}?,D�qr� �ܱ]I��X� ��ۅs#��� \ƿksI؛��l�E��v�^[>�A,�EE8�~���f�)�>������^��O�6g���l��worldMatrix), vec4(a_position.xyz, 1.0));
    v_color = a_color0;
}



#endif

#ifdef FS
$input v_color
#include "../_ibrary/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform ma�4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_3inTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

//SAMPLER2D (CC_Texture0,0);

uniform vec4 u_color;


void	main()
{
    gl_FragColor = vec4(v_color.rgb,1.0);
}


#endif
