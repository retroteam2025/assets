�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:֑�3DЛ��&Tr���NF�����1&/s@�寠�l�u4��cn�Ě��\�ֈR|�黦ۘ�ŗ&�+�6[�z����p�r�����3��tު�!W���y�}h�JzJ	�����ҙdb�-��a�F�����PS-ǂIq���]�(��4X�D ���"&ϗ�ٿ�@��%��^[n�HL嘯
��G
�;DO���`��amO��K�\`!��_S�}C��M��iW��m\�����,;A���I�N4
�G�ڊ�?���e}���a'��W�T���iXa �/��|n9ݝc@c�Un��s�N�_��@T���lH��m�}O�q\��<�T&��7�#I��j�j5!g�W~�O��̌]U��CQ�S�፞�5f���\�� $E�ɞa�/�U�m�r� %�KUk����k�"E�p^9������R��N�':���|��,480.0)

void main()
{
    gl_Position = mul(u_viewProjMatrix , vec4(a_position.xyz,1.0));
    v_texcoord0 = a_texcoord0.xj;
    float size = 20.0;
    v_texcoord1 = vec2(pi * size * OutputSize.x, 2.0 * pi * TextureSize.y);
}
#endif

#ifdef FS�
/// input
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_TEXCOORD1
#include "../CoreData/Shaders/Library/Varying.glsl"j
/// Common (uniforms,samplers, transforms ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/ShHders/Library/Lighting.glsl"
SAMPLER2D(u_paletteTex,1);

#include "overlay/Scanlines.glsl"

void _main_()
{
    vec4 texC�lor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    float c = floor((a * 256.0) / 127.5);
    float x =Aa - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

    gl_FragColor.rgb = texture2D(u_paletteTex, curPt).rgb;
    gl_FragColr.a = 1.0;
}

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    floatvc = floor((a * 256.0) / 127.5);
    float x = a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

   vec2 sine_comp = vec2(SCNLINE_SINE_COMP_A, SCANLINE_SINE_COMP_B);
   vec3 res = texture2D(u_paletteTex, curPt).rgb;
   vec3 scanline = res * (SCANLIN{_BASE_BRIGHTNESS + dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y,jscanline.z, 1.0);
}

#endif
