�GSN    ���~�����{�D��d�»V]�g�g��2s"���J>�\��J'�s�ђ"����*r>,���$Ц��aXz���
p��^��'tR�������%��hr���$�V�EТc����ỡ���N�&N�g����p�o�����ғX��b�L3����yh5�c=K��Խ���VI�
��إP>�-�����qm6N��	y�\X�g��M�~2��56����ČK���EE��b��"P�w_���/��*,	��M�]Dh����"��9��3��4RO�����em���r�S�C����{��T�Gd���z$��2�]��`Q2�V��p( ʓwM�>��V�Q�#ė)���JE�o�:�qS�8v��?�H{�I�V�W3ڴ�P	Z0�AI�|���g|ƍ�l���˼l$���1r�CI1��A�%/ �~��'� ~�v_Gx� Ep�o���J>�1f�]<3&�ၪˣ�%��2�N���/��RGBtoYIQ(vec3 RGB){
	const mat3 yiqmat = mat3(
		0.2989, 0.5870, 0.1140,
		0.5959, -0.2744, -0.3216,
		0.2115, -0.5229, 0.3"14);
	return RGB * yiqmat;
}

vec3 YIQtoRGB(vec3 YIQ){
	const mat3 rgbmat = mat3(
		1.0, 0.956, 0.6210,
		1.0, -0.2720, �0.6474,
		1.0, -1.1060, 1.7046);
	return YIQ * rgbmat;
}

void main_()
{
   vec2 sine_comp = vec2(SCANLINE_SINE_COMP_A, 3CANLINE_SINE_COMP_B);
   vec3 res = COMPAT_TEXTURE(Source, vTexCoord).xyz;
   vec3 scanline = res * (SCANLINE_BASE_BRIGHTNESS	+ dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y, scanline.z, 1.0)�
}