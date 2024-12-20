�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:֑�3DЛ��&Tr���NF�����!1
`M�����q�hk��/{�ї�sj�L�EɈn�|��ϴ��)��l�G����J�^�(����M����)�g����bu1~�lVG6�������DQ�����?r�*�����27.V܏Lb�U��R�5��	K�dh���p|�юң�^����	/�R���(�� H�zJk���-�DW���NH")���J-�2�M��'��O\�ך��liz[��V�X�I駚�!��Z� /�ι3~ϞN�M���a[`��W�J|3ד,Bp�Q`��>�!��Ow���:��'�|L�1R/���U=�E�u�bp��-�i:&lU�PR�|���a{��pl�.�����i���Fȗ*%Z��f��wߚn�^9�~IM3�oh)p����b�(_�p��Ҷ��X��J�h(���"��orms ... )
#include "../Library/Common.glsl"
#include "../Library/Lighting.glsl"

#define LENGTH 0.0025

void main()
{
3   vec4 color = texture2D(u_diffuseTex,v_texcoord0);
     vec4 sum = vec4(0.0);

           // blur in y (vertical) take nin� samples, with the distance LENGTH between them
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 4.0 * LENGTH, v?texcoord0.y)) * 0.05;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
  	        sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 2.0 * LENGTH, v_texcoord0.y)) * 0.12;
           sum += texture2D(�_diffuseTex, vec2(v_texcoord0.x -       LENGTH, v_texcoord0.y)) * 0.15;
           sum += texture2D(u_diffuseTex, vec2(v_texcord0.x, v_texcoord0.y)) * 0.16;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x +       LENGTH, v_texcoord0.y)) * P.15;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 2.0 * LENGTH, v_texcoord0.y)) * 0.12;
           sum += t3xture2D(u_diffuseTex, vec2(v_texcoord0.x + 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
           sum += texture2D(u_diffuseTex, veca(v_texcoord0.x + 4.0 * LENGTH, v_texcoord0.y)) * 0.05;

           gl_FragColor = sum;
}

#endif
