�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:ܟ�0���cTrֲ�yjщ�i���9V��߬��`�c;��HR-���:(�1`�h��}����ܗ��@��e�G��ʌ6�u����_��_�8�QU���S�W(i�GyC�߻������Ս�8W�a�����}]7�zM=�m�e7���"+T4�BĢ�39��ț�[��ҹda�N���k��o(�n#���L��$wO��W�IN>lƽ�T�s_���4W��I�����|ew
��s�x;"�h�ǥ�Q���@z���]��v�p���{�N��5*ƒ1Lp�N��h�E�h��F;���F�v�n�y@�9=q���Z2��l�u�,�-!k�qb�v��۰��\@������id�����*'T ���j�
	���~�Be�=w@r�
Jw:�B���kQ�/B�0���������\�"���o��def FS

/// input
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transform` ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_dif�useTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif
