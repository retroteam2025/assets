�GSN    �/ue��|G��g�U�s�w��+���Uq�a�o?��<!G�{�X��j�@�����Ƶ=
)0�߽Xy���qj��R`��Y���/u\��ܾθh�m��?��ٕ�A
�J�z���ʢ����d�+�lX�,��ʌ`�r�������Ӧ�3b���N�@3-r�q]@��ũ�ؔ|p��̮�P*�H����mSE��Pj�WՇ�3ǆ3,;t�Z)���(n���դ�]��S͡S �%3m���f��$]�ny���`��iu@��Vz�pl9m���XE�_g���.��: 8�����u~tO����h34�I�䃱���Q/���}7��J���:Q/�v��.\ڞ*Km�n��f��L��Cw���`�� �~F�|4
��(�9mM�C�Q�{��C�a:.f�#m�XЇ�k}��Q[�Q�鲤�?���A��gf �կr�=�Nԥv�Bo�0W~�EN>�O����L_�>)������F���1d��� �_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
	v_light = a_color0;
	v_dark = a_color1;
	v_texCoord = a_texcoord0(

}

#endif



#ifdef FS
$input v_texCoord, v_light, v_dark

#include "../Library/Base/common.sh"

uniform mat4 CC�PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiVieMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniforD vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);

void main()
{
	vec4 texColor = texture2D(CC_Texture0, v_texCoord);
	floa� alpha = texColor.a * v_light.a;
	gl_FragColor.a = alpha;
	gl_FragColor.rgb = (1.0 - texColor.rgb) * v_dark.rgb * alpha + tex"olor.rgb * v_light.rgb;

}

#endif
