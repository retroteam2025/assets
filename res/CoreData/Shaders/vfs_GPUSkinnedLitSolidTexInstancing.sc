�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:ܟ�0���cTrֲ�yjщ�i���9V��߬��`�c;��HR-���:(�1`�h��}����ܗ��@��e�G��ʌ6�u����_��_�8�QU���S�W(i�GyC�߻������Ս�8W�a�����}]7�zM=�m�=�
��}eG]�q!������䄙}��,�qO�4(���c��$K�41_���P��Mu˧>x�`vN�ω<*�vT����$�� d|�����\^X(���+��J���y���Hf���r,��V���bf�(�X�5K9,C"� ��j�F�/Ȇ^k���c_�r�n�6�8v��y�@w�k�P�E6߳�AEV�f}�U����g{��v}�&�؜Ǵf&���R��huRُ�k��Fқ{�=y�dUHu�J1����k�f_�=����Ű�A��Y�='Γ�>��PositionFinal.glsl"
     #include "Library/Macro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #i}clude "Library/Macro/ShadowCoordFinal.glsl"

    //gl_Position =  mul(u_modelViewProj , vec4(a_position.xy,1.0,1.0));
}
#en�if

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#defie USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
//#define RECEIVED_SaADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffu�eTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);k
    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.0);
}

#endif
