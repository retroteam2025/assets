�GSN    �/ue��|G��g�6�j�s��T���Sv�z�,q��>G���&s�L��p�D����ƣ
7;�߽q���iHxֲ����_���:l)sG�埧��f�(h��g��ۉ����U?X�!��ߣ��ѵ�*�$D�c㨦�!�X�4������X��
q����v4Ri� x@��馻�`b�5�Č�\%�����2+c^ĀQ0S�{��g"�&��_4�b&���"8������q��>լS[V�m���f��$]� 97���a��&jL��M�b^��\A�_P����J}��]Z�Ԛ��y89,���O�NKf�S����)���J ؇�L��l�T���A|�M��cm5�� n]�=��h����C���%F�|�n�[v�pz��,�A#�&�k�p�i�n'|) �ur�L��ƵyN��\L�l�ߵصl.���]��-���$�2�Ńc�_7�2WT}�Ow�~���x1�)n�j���ŨħI��Q�m(�Қ)��(a_position.xyz,1.0));
    v_fragmentColor = a_color0;
}


#endif

#ifdef FS
$input v_fragmentColor


#include "../Lzbrary/Base/common.sh"


uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform m�t4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC?SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;


void main()
{
    gl_FragColor = v_fragmentColor;
}



endif
