�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:ǜ�5XӦ��lS��O���_���:l=wF������|�(|��m>g��܎�A�G�z���ʣ찄�'�(�.	����:�X����U��T��8�#Ð�D�#J>s�mFN�򘐘��F[�����|�L�ۢ��47m܅@$Q�QŘP �h��W�p$���]_���Ԥ�����?
�kf �ԭ$��.I�p,���m��;aٕK� q#r��^N�{_��C��4��mؖ���uz|O���S��E���{���H`ر�.~��T�i���z]}�Z�\�$&f��l0�Qu��%��c��^9彧%�s��k@�x{��<�Z<��*�$S��D�/sho�bo�Oԇ��Ap��FW����ǿr:���)��T �Ɯk�@���b�Sd�s^Du� T/�S�דRZ�L_�x��ըů�]��Y�'i痈��wport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   gl_Position.x3= u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Frag shader
#ifdef FS

#include "Library/Common.gl�l"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
