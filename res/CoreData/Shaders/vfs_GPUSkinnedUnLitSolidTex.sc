�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:ܟ�0���cTrֲ�yjщ�i���9V��߬��`�c;��HR-���:(�1`�h��x�����ٰ��h�=�N�z����e�o�����p��7��e�v���B�G<y� pJH5�����ҙlh�<�ꪞt������3<.+��kC,�v�e-���? 6}�Bį�6<���|��:�rf_�.-d٣�H��	(�7b���k��kTH��K� w-s���V�~B��`��MX��GxZ�����2yw���K�\K�T�瑻4���:��T��]�P���IdG3�i�9�\F��`Dl�;��%�g�m��X`���h]�q�)�kE�q��s��E�-�w��C�/sh)V�mx�N��xF��TF�N���ܵ*���ZÜLnA̎�h�
B`���7�y�~OEt�G)J=�@���B �4�q������O��T�I���l��include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
}
#endif

#ifdef FS

///3input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#include "Library/Varying.gl�l"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void@main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif
