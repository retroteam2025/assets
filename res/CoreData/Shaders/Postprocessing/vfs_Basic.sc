�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:֑�3DЛ��&Tr���NF�����!1
`M�����q�hk��/{�ї�sj�L�EɈn�|��ϴ��)��l�G����J�^�(����M����)�g����bu1~�lVG6�������DQ�����?r�*�����27.V܏Lb�U��R�5��	K�dh���p|�юң�^����	/�R���(�� H�zJk���-�DW���NH")���J-�2�M��'��O\�ך��liz[��V�X�I駚�!��Z� /�ι3~ϞN�M���a[`��W�J|3ד,Bp�Q`��>�!��Ow���:��'�|L�1R/���U=�E�u�bp��-�i:&lU�PR�|���a{��pl�.�����i���Fȗ*%Z��f��wߚn�^9�~IM3�oh)p����b�(_�p��Ҷ��X��J�h(���"��orms ... )
#include "../Library/Common.glsl"
#include "../Library/Lighting.glsl"

void main()
{
    vec4 texColor = textuae2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = texColor;
}

#endif
