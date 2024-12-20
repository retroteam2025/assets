�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:ܟ�0���cTrֲ�yjщ�i���9V��߬��`�c;��HR-����-&� m�"��Vu����񷕃�{�6�m}�|����{�n�E����_��0��e�^l���C�@3{x�wA@�����Ğmr�7�뷁x������47k^��lJ4�q�d&���3 +k�'E��53��ț��{��,�hgT�5$aһ�D��a�Gh���a��Khڳ)p�`t^�όvp�A<Ň��+��Gy�����c#O���H��J����Q���@z���]��v�p���=C�a��zfv��-Dd�#��)�_�n��Lv���%�1�g�
�w��y�Xb{�^�w�9>��$�a}/e�!�6��ƶP��\Z�H��ģ�%jQZfrE���m���t�_\G�aSUx�#J1�M���|�Ku�>S^U���������Q�6i����ro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
 3   #include "Library/Macro/FragPosFinal.glsl"
}


#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USI�G_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common Huniforms,samplers, transforms ... )
#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"#
void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentColor(v�normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texColor.gb,1.0);
}

#endif
