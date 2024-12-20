�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:֑�3DЛ��&Tr���NF�����1&/s@�寠�l�u4��cn�Ě��\�ֈR|�黦ۘ�ŗ&�+�6[�z����p�r�����3��tު�!W���y�}h�JwA��Խ���~��ᙧTr�m����rgۀW}\�YՓX�i��F4�B���p���ԣ���ƯU_s�JLT��t��?H�4J"���� vB��\�b.��Td�fP����"��+RW����Yct���A�XI�,�狻4��T�H`���L(��O�K��o@`��}�\ٟ*I"� '��,�!��
9���Z`�l�:�wG�,4��4�%X{�[�w�|0��;�wsd)�`/�Z��Ƭ][��[������,c���R��|X E�ßk�PM�߷c�Hx�`^?�^.U�,���a� r)�P��Ǻ���"���k(ꜜ9��
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transform` ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"
SAMPLER2D(u_p�letteTex,1);

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    float  = floor((a * 256.0) / 127.5);
    float x = a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

    gl_FragColor.rgb = textu[e2D(u_paletteTex, curPt).rgb;
    gl_FragColor.a = 1.0;
}

#endif
