�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:֑�3DК��&Tr���NF���T���1:DDQ����زy�r5��rpH�����@�E��i�����砃�n�#�1G���ͩ:�;�����]ڐS��%�pϜ�B�,W+z�s\HN�������GX�
��ؔe�V���֨t��Kg�\��>�%��Kz�z%���79������8����JSi�NE-�����m�}
o���j̮qC�@�b@/sڲ�^S�fX��+�&��HYڴ���:#6O���C�_K�P����8��~�	4���r*�����Qd}�V��;pv��r2�AaЃ+��Ć
���q�?�n�E�A{��u� k��4�&T��i�!cs�#;�W����@ƀA����Ͼ`.���CÀ~\D}���$�F�@��c�N7�MY@b�F;�H���`�N~�y^V�������\���1W���/��edViewport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   gl_Positzon.x = u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Frag shader
#ifdef FS

#include "Library/Comm�n.glsl"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
