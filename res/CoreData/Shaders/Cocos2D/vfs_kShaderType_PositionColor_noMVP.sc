�GSN    �/ue��|G��g�6�j�s��T���Sv�z�,0��2Z���8�M��qJ�m��� ��͹,=	4&�غv���cRn޲�KW���~���"7{L������o�tv�`h^����4�M�Ê%1z��������|�-�-Y�.����5�X�&��������?�e����,Ml<�*Ab>0�������.7��×�X}�dŨ�ۢ{݈sm�u�|�5��+[9�=���?'���ڹ���,�U_a�+T��<��8K�r~���j��i[bˠT�,Ft���^R�2G��Y��(��	o\�܁��obp	����N_�e�֡�(�����z8��U�O���.wQ3�C��x8g��I � ��p�N�-ʈU���dB�0�/�}�~y��2��!�p���$�b2<=U�\m�^��۰^b��G]�Z�����c%�ݭR��*r+W�Ҝ`��Y���_s�[H�Lh)$�+���/�/L�w������ ��N�!Ӏ�&��trix, vec4(a_position.xyz,1.0));
    v_fragmentColor = a_color0;
}


#endif

#ifdef FS
$input v_fragmentColor


#incude "../Library/Base/common.sh"


uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;�uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
unifom vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;


void main()
{

    gl_FragColor = v_fragmentColFr;
}


#endif
