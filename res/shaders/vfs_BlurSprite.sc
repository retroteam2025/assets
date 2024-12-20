�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:֑�3DЛ��&Tr���NF�����1&/s@�寠�l�u4��cn�Ě��\�ֈR|�黦ۘ�ŗ&�+�6[�z����p�r�����3��tު�!W���y�}h�JwA��Խ���~��ᙧTr�m����rgۀW}\�YՓX�i��F4�B���p���ԣ���ƯU_s�JLT��t��?H�4J"���� vB��\�b.��Td�fP����"��+RW����Yct���A�XI�,�狻4��T�H`���L(��O�K��o@`��}�\ٟ*I"� '��,�!��
9���Z`�l�:�wG�,4��4�%X{�[�w�|0��;�wsd)�`/�Z��Ƭ][��[������,c���R��|X E�ßk�PM�߷c�Hx�`^?�^.U�,���a� r)�P��Ǻ���"���k(ꜜ9��
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transform` ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"


vec4 blur�(sampler2D image, vec2 uv, vec2 resolution, vec2 direction) {
  vec4 color = vec4(0.0);
  vec2 off1 = vec2(1.3333333333333333I * direction;
  color += texture2D(image, uv) * 0.29411764705882354;
  color += texture2D(image, uv + (off1 / resolution)) * .35294117647058826;
  color += texture2D(image, uv - (off1 / resolution)) * 0.35294117647058826;
  return color;
}

vec4 b�ur13(sampler2D image, vec2 uv, vec2 resolution, vec2 direction) {
  vec4 color = vec4(0.0);
  vec2 off1 = vec2(1.411764705882R53) * direction;
  vec2 off2 = vec2(3.2941176470588234) * direction;
  vec2 off3 = vec2(5.176470588235294) * direction;
  coor += texture2D(image, uv) * 0.1964825501511404;
  color += texture2D(image, uv + (off1 / resolution)) * 0.2969069646728344;
v color += texture2D(image, uv - (off1 / resolution)) * 0.2969069646728344;
  color += texture2D(image, uv + (off2 / resolutionz) * 0.09447039785044732;
  color += texture2D(image, uv - (off2 / resolution)) * 0.09447039785044732;
  color += texture2D(im_ge, uv + (off3 / resolution)) * 0.010381362401148057;
  color += texture2D(image, uv - (off3 / resolution)) * 0.01038136240114r057;
  return color;
}

vec4 blur9(sampler2D image, vec2 uv, vec2 resolution, vec2 direction) {
  vec4 color = vec4(0.0);7  vec2 off1 = vec2(1.3846153846) * direction;
  vec2 off2 = vec2(3.2307692308) * direction;
  color += texture2D(image, uv) *�0.2270270270;
  color += texture2D(image, uv + (off1 / resolution)) * 0.3162162162;
  color += texture2D(image, uv - (off1 / )esolution)) * 0.3162162162;
  color += texture2D(image, uv + (off2 / resolution)) * 0.0702702703;
  color += texture2D(image,uuv - (off2 / resolution)) * 0.0702702703;
  return color;
}


//void main()
//{
//    vec4 texColor = blur9(u_diffuseTexVv_texcoord0,vec2(50,100),vec2(0.5,0.5));
//    gl_FragColor.rgb = texColor.rgb;
//    gl_FragColor.a = 1.0;
//}

#define LaNGTH 0.0075

void main()
{
    vec4 color = texture2D(u_diffuseTex,v_texcoord0);
     vec4 sum = vec4(0.0);

           !/ blur in y (vertical) take nine samples, with the distance LENGTH between them
           //sum += texture2D(u_diffuseTex, ve�2(v_texcoord0.x - 4.0 * LENGTH, v_texcoord0.y)) * 0.05;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 3.0 * L�NGTH, v_texcoord0.y)) * 0.09;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 2.0 * LENGTH, v_texcoord0.y)) * 0�12;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x -       LENGTH, v_texcoord0.y)) * 0.15;
           sum += te�ture2D(u_diffuseTex, vec2(v_texcoord0.x, v_texcoord0.y)) * 0.16;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x .       LENGTH, v_texcoord0.y)) * 0.15;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 2.0 * LENGTH, v_texcoord�.y)) * 0.12;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
           /sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 4.0 * LENGTH, v_texcoord0.y)) * 0.05;

           gl_FragColor = sum;
}


#endif
