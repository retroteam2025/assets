�GSN    �/ue��|G��g�U��(ߩb���N�6�e7��8^+{ԏ�s�k��]g�������M9&��S@���}tr��D�����I`wR����ď@�AD��NI>����03�,j�o��w�้�����{�k�#Y�g����y�w�f�֋�R��~��'�#���_�"K5o�E>[��������M����4�f�����gۀW}\�Wʇ^� ��Mi3�>���p8��Ó��8��y��#�L��'��$G�uu���l��fHN�P�Ag%o���VL�~®M��hX��MP��չ�l,j���+�PK�J���.��T�Nx���`7��W����.<\��W�;8m��c"�!��%��/��FF���lD�p�`�8� :L��3�H "�!�%�6��(�/'x)H�vD�Z��ȻQK��PC���䞇>GŐ�RU��ksTT���$�9�Bߌr�fr�bUSe�T8R����c�2_W�>N^�����M��Q�3x쀘�;
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   //gl_Position.x = u *32.0 - 1.0;
   //gl_Position.y = v * 2.0 - 1.0;

   v_position = gl_Position;
}

#endif


/// Frag shader
#ifdef FS
�#define USING_INOUT_POSITION
#include "Library/Varying.glsl"


#include "Library/Common.glsl"

void main()
{
    //floa depth = v_position.z / v_position.w * 0.5 + 0.5;
    //gl_FragColor = vec4(EncodeDepth(depth),1.0);
    gl_FragColor = vec4_Zplat(0);
}

#endif
