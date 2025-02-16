�GSN    �/ue��|G��g�6�j�s��T���Sv�z�,q��)K�Hg���f�]���m�ֹ'{"Ѵ�q���FRp���
U���E���1'f9ҿ����{�&v��5<)����
\�h��}��ư����J�	�._�X����X�o�����F��H��,�n���B�mzC�?SN������J[�����Ai�F���α8z��	y�VΌ^ �g��[Dz�H���9��������ɸ|]�kfU���h��mH�`W,���A��$yMٕK�WA��WO�����4��VPô���sjv���C�P(�y����2��O�#a���|,��N�ZѮ�MkQ�v��.\ڞ*Km�n��f��L��Kw���5��C�;@�rx	��<�T =�E�w�d��(�j|+f�lu�H����9%��\R����Ϯ1j���Vۢxhm�Ԃm�]mg�+ȇ~�v�|�h)����P1�5W�q^K�������D��g�-m���#��atrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}



#endzf

#ifdef FS
$input v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform�mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
un	form mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01

SAMPLER2D (CC_Texture0,0);

uniform vec4 u_textColor;


void main()
{
    // gl_FragColor = v_fragmentColor * textur�2D(CC_Texture0, v_texCoord);

    vec4 color = texture2D(CC_Texture0, v_texCoord);
    //the texture use dual channel 16-bitAoutput for distance_map
    //float dist = color.b+color.g/256.0;
    // the texture use single channel 8-bit output for distnce_map
    float dist = color.a;
    //TODO: Implementation 'fwidth' for glsl 1.0
    //float width = fwidth(dist);
    //7ssign width for constant will lead to a little bit fuzzy,it's temporary measure.
    float width = 0.04;
    float alpha = sm<othstep(0.5-width, 0.5+width, dist) * u_textColor.a;
    gl_FragColor = v_fragmentColor * vec4(u_textColor.rgb,alpha);
}

4#endif
