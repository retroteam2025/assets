�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:֑�3DЛ��&Yy���Oʝ�s���?Sz������*�hx��eyJ��܂�� ԉR��텶�����I�m�.����`��H������hì�!J���b�| _�&LkXm�������GX�A�̚�T/�*����3> ŒI&~�5��U�.��P&*j�V���X���]����Gn� R���+��?D�gc���/¢g8��UP�LM9eн�}I�`P��Bخ*��I\Y�՘��o ���K�BC�+����{��T�
}���f:���P���|M=!�A��Eg%Ƅ*Bl� ��+�G�cƫ 9���%�q�"�|L�3X��}�_�O�j�B�&�}7xO�bw�\����9%��?���٣�@���V��LTy*���+�F	�T���Tq�|_D�,+d �o���P5�<l�L7N{������L���-j�5�arying.glsl"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.gls"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,texColor.a)�
}

#endif
