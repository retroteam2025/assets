�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:ܟ�0���cTrֲ�yjщ�i���9V��ߡ��e�b~��Mu��ǙV1�P��	o�������&�k�-^�~��ʌ6�~�����.��zϬ�+W���d�uU�{I�����Ր|t�,��p�J����WzjψKaS�k�v-�	��$07q�S����֧���T����t{N�9%n١�X��b�[7���a��<|D��:P�]@>x�ˬCY�|V���ez��mי���wcwO��O�D�����:���[y��=pϗ5����bAv	� ��gi$�� Bo� ��i�G�� o���%]�v�f�#�\��<�YG|�@�a�6_ڔ+�n!1&8�`i���ڶ@F��s]� ���©ihº�R��)nC�Քa�D,�Sߚn�}t�}o~�O�O���h�*].�>S^VҀ����L���-j�5�acro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
     //#include "Library/Macro/FragPosFinal.gls"

     v_FragPos = position.xyz;
}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCO�RD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS

#include "Library/Varying.glsl"

/// Common (uniforms,saplers, transforms ... )
#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main)
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0.xy);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
�   vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texColor.rgb,1.0);


#endif
