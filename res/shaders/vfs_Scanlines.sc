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

#include "overlay/Scanlines.glsl"


void main()
{
   vec2 sine_comp = vec2(SCANLINE_SINE_CO�P_A, SCANLINE_SINE_COMP_B);
   vec3 res = COMPAT_TEXTURE(Source, vTexCoord).xyz;
   vec3 scanline = res * (SCANLINE_BASE_BRIG)TNESS + dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y, scanline.zL 1.0);
}

#endif
