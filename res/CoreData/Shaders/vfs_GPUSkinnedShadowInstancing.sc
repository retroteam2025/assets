�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:֑�3DК��&Yy���Oʝ�s���?Sz������*�hx��eyJ��܂�� ԉR��텶�����g�,H�{���Y�y�
������T��d�p���<�Gw3�*qB�����LO���اG<�v�����}w P��(P�]��_� ��/</p�Y���Zv���ң��� �iqI�!a*���d��)@�6(e���}��
wL���CR #���;V�{U���o^��6?ؙ���sbz����g	�G��͐:���y{���z1��Q�X���bG~N�(�W�:'v5H"�n��%�[�l�� 9���i_�k�;�%	�vx#��o�G}��%�6L��`� sz'E����ŰU[��	�I�����v#�����!'E���+�TN]�,��7�Vx�fU!�XEV �@���k�F�n��������T�%|���l��u_cascadedViewport[1];
   float t2 = u_cascadedViewport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * f;
   v =  t1 + (t3 - t1) * v;

   gl_Position.x = u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Fr�g shader
#ifdef FS

#include "Library/Common.glsl"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
