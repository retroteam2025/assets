�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:ܟ�0���cTrֲ�yjщ�i���9V��ߡ��e�b~��Mu��ǙV1�P��	o�������&�k�-^�~��ʌ6�~�����.��zϬ�+W���d�uU�{I�����Ր|t�,��p�J����WzgʍP`��S �5��&@�y/ɬ�#9�֧���ǘ0ϭJ]n�NN���u��m	�`m���`��:8��V�%%o��UE�0}����>X��
VZ�����v.e���I�OP�O���Q��~�	4��z0��M�\Ŭ�gV`�[�:�vz9��,^k�!��l�J�!��Yu���%�?�m�vJ�dp��P�\s�U�H�u���}>)e3�mz���ڳ"��A��Ͷp.���>Z΀ku���v�I4�Bчe� 5~�sVv�	R�\���j�/.�y]�����Թ%��2�k'���<��
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, gransforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{

    vec3 environmentColo� = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + envionmentColor) * u_matDiffColor.rgb,1.0);
}

#endif
