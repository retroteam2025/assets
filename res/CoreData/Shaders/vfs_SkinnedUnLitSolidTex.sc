�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:ܟ�0���cTrֲ�yjщ�i���9V��߬��`�c;��HR-����7)�-c�o��w�้�����{�k�'Y�k����`�5�����w����j�w���;�n]=z�{=3�����՘vi�-����yP�&����8y[-�b[:�w�n&���?= 	�k���9;���脙u��=�smS�'(o���H��@/�pj���/�� Vf˽8v�{~
S�ڝ~s�����#��+RW����Lmk����G�+����t��7�Dy���;+��^�K���"f�L��ge%��m"�lD��`�B�j��aP���Kw��'�{E�uq\��u�O`��j�{��.�|?j�	m�R��ľ]AΔ8>�l���%i���Fȗ*%8I�ґv�I-�S��G�Cc�}Tgx�	8�RĮ�A�f_�w��ĺ�ރJ��J�kE⑞#�ormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
     0include "Library/Macro/FragPosFinal.glsl"

}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INO�T_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (unifoms,samplers, transforms ... )
//#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

vFid main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif�
