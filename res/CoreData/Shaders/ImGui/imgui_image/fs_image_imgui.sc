�GSN    �(um��nG����<�u�c�����Sl�y�d4�sPQ��E5�X��*(�Aꡥ��̣A!yY�߽q���jOq���^���b���71j������f�k;��u(J����
r� ѭ8o�������g�"�0F�c���V�D�=������0��$�l�݆[�9x_�6Sy8-������)H�
�ʊ�0�q���۾,b
��La�n��P�.��D2_4�b&���"8������q��=ϲJSl�R���
��#L�{a���lج
[~��\�"+9o���CM�dT��M؂$��3RX�����te ���P�HDK�e�ʍ����$���u1���\���MwM>�L��%9m��N'w�(��h�]�lІ_F���bU�p��yK�tpG���)o_�`�W�RU�=�w'e�/;�ߪ��>��S]���Ƿd-�����*'�͑c�*	�Oߊ{�T]o�Et�F�~���h�(A�{^�������G��V�&d��5��
void main()
{
	vec3 color = texture2DLod(s_texColor, v_texcoord0, u_imageLod).xyz;
	float alpha = 0.2 + 0.8*u_imageEnabled(
	gl_FragColor = vec4(color, alpha);
}

