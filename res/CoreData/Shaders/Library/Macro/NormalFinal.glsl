�GSN    �u��)G��� �3��$��o���iI�[�I��W^^���^:�U��%�F��	��ǃ  :8���y���+Eeɾ�uT���U��*v]������&;��.r��ԌYZ�{�
Ԑ �{��Ǣ����)�d�-Y�o����t�u�����p��X��#�s	⺅_�)\><�'M{).���ڟ�������B2�i����4!.C��@p:�KӋ_�
���H,���`y���ڹ���,ġSS2�3D���4��@/�4D,���b��i%���@S e���CI�2����o��
ZYԉ���3"a�̇,�N�+����{��W�Op���]��y�f�Ϩ\}Ja��W�xi"��*Ct�=��w�E���ON���a}�k�'�8�|u��i�@d�^�`�d��9�|6f�gV�O��фr��LN�A�����`8��� RzhE�ςh�+�HƳ&�n�>TN�F-�D���a�)F�q�������@�>!���l�� normal = mul(inverseTransposeWorldMatrix , normal);
    #else
    normal = mul(u_model[0], vec4(normal,0.0)).xyz;
    #endiu
#endif

    v_normal = normalize(normal.xyz);
