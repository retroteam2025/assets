�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:ܟ�0���cTrֲ�yjщ�i���9V��߬��`�c;��HR-���:(�1`�h��x�����ٰ��h�=�N�z����e�o�����p��7��e�v���B�G<y� pJH5�����ҙlh�<�ꪞt������3<.+��kC,�v�e-���? 6}�Bį�6<���|��:�rf_�.-d٣�H��	(�7 i���j��Qoӫ?w�zuG�܊ao�;����2��Ew\�����5Zx���A�L�����t��T�Fy���3v��Q�V��.2�C��zz;��m,�HC��a�M�a��mI���Ny�Q� �#�xz��x�Z^�N�d�oRՒ$�`=fn�o9�1�߰]K��T]�I�ߵ��jRŜikDŀ�H��X��v�B8�}IHe�
e6�@Ģ�c�dr)�>S^V������M��t�&z―c��cro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"

}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOOR�
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
#define RECE)VED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(uvdiffuseTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_nor�al);

    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.0);
}

#endif
