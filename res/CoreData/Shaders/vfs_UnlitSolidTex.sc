�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:֑�3DЛ��&Tr���NF���T���1:DDQ����زy�r5��rpH����VH�CK�ֈq���¿����@��e�[����M�T�9�댈^��^��.�^!���D�?@wJ�gF������)0�L��ؐZ0�j߼��4?aĒ(S�JƄB�5��PAJ�>E��>6������~����^C�O���k��o(�nz���/�� v	��|B�%l!���XN�~D��M��.��B�����5\v���I�m�J�7��~�	4��z0��M�\Ŭ�gV`�[�:�vz9��&Ua�<��C�E�c��Fj���M��+�|@�q��u�Kt�j��w��f�f=8|�	8�^��Ǻz��{s�(�����Q���=a��WI�Üq�@O�Hܚv�I\A�`CH�KO,����N�i_`�sҋ���Z���%e�>�� transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = textfre2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,texColor.a);
}

#endif
