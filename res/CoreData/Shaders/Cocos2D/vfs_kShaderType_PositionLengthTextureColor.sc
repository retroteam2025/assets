�GSN    �/ue��|G��g�6�j�s��T���Sv�z�,q��)K�Hg���f�]���m�ֹ'{"Ѵ�q���FRp���
U���E���1'f9ҿ����{�&v��5<)����
\�h��}��ư����J�	�._�X����X�o�����F��H��,�n���B�mzC�?SN������J[�����Ai�F���α8z��	y�VΌ^ �g��[Dz�H���9��������ɸ|]�kfU���h��mH�`W,���A��$yMٕK�WA��WO�����4��VPô���sjv���C�P(�y����2��O�#a���|,��N�ZѮ�MkQ�v��.\ڞ*Km�n��f��L��Kw���5��C�mG�w{��j�2�s�i�~��C�p!g�v�Ɖ��xF��TF�N�����f%���ߚ(
~-�՞m�	 �Lߜ#�E,a�wMqc�(B+�Hз�l�0J�>�������"���#dܢ�?��ion = mul(mul(u_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = vec4(a_color0.rgb * a_color0.a3* u_alpha.x, a_color0.a * u_alpha.x);;
    v_texCoord = a_texcoord0;
}



#endif

#ifdef FS
$input v_fragmentColor, v_�exCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4@CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 Cj_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

//SAMPLER2D (CC_Texture0,0);


void�main()
{
    // gl_FragColor = v_fragmentColor * texture2D(CC_Texture0, v_texCoord);

    gl_FragColor = v_fragmentColor * tep(0.0, 1.0 - length(v_texCoord));
}


#endif
