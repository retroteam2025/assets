�GSN    �/ue��|G��g�6�j�s��T���Sv�z�[ߵ(N�:�M��F)�b������e'22��\{�ߴ�F~C��^Jɧ�J���71jo��ś�g�`t��!q􉕣:8�5i�ԔG���;���h�p�h�C����a�r�P������O��'�
7���i�8U,u� {X%6������x	�Xۯ��\;�wܼ���nyM=��Jv�T�E �?ȫz
P�x:��56������[��H��R\i�	M���d��f�Gb���jׁCmO��K�W)b���r�}B�� ��J}��]Z�Ԛ��y89,���G�O�����Q���Ea���1p��t�[��wP�G��xe9��0E �kC��k�M�}��Gx空po�v�9�jF�\u��d�w$�Z�l�6��'�&^Brx�#;�����[\��\[�A���۶-'�ܥlڛop$R�ʽe�	�b��Z�}c�{B1�EF<�	���`�2L�0ރ��ջ���E�N�щ"��f

#ifdef FS

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
unifoam mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform�vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

uniform vec4 u_color;

void min()
{
    gl_FragColor = u_color;
}


#endif
