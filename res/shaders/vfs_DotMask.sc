�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:֑�3DЛ��&Tr���NF�����1&/s@�寠�l�u4��cn�Ě��\�ֈR|�黦ۘ�ŗ&�+�6[�z����p�r�����3��tު�!W���y�}h�JwA��Խ���~��ᙧTr�m����rgۀW}\�YՓX�i��F4�B���p���ԣ���ƯU_s�JLT��t��?H�4J"���� vB��\�b.��Td�fP����"��+RW����Yct���A�XI�,�狻4��T�H`���L(��O�K��o@`��}�\ٟ*I"� '��,�!��
9���Z`�l�:�wG�,4��4�%X{�[�w�|0��;�wsd)�`/�Z��Ƭ][��[������,c���R��|X E�ßk�PM�߷c�Hx�`^?�^.U�,���a� r)�P��Ǻ���"���k(ꜜ9��
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transform` ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"

#include "o�erlay/DotMask.glsl"

void main()
{
   vec3 res = pow(texture2D(Source, vTexCoord).rgb, vec3(2.2,2.2,2.2));

   float mask@= 1.0 - DOTMASK_STRENGTH;

   //cgwg's dotmask emulation:
   //Output pixels are alternately tinted green and magenta
   veJ3 dotMaskWeights = mix(vec3(1.0, mask, 1.0),
                             vec3(mask, 1.0, mask),
                            �floor(mod(mod_factor, 2.0)));
   if (shadowMask == 0.)
   {
      res *= dotMaskWeights;
   }
   else
   {
      res *= ,ask(floor(1.000001 * gl_FragCoord.xy + vec2(0.5,0.5)));
   }

      gl_FragColor = vec4(pow(res, vec3(1.0/2.2, 1.0/2.2, 1.0/R.2)), 1.0);
}

#endif
