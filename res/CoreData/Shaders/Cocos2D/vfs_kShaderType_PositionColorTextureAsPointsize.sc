�GSN    �/ue��|G��g�6�j�s��T���Sv�z�,q��)K�Hg���f�]���m�ֹ'{"Ѵ�q���FRp��� .���S���'&K0�尡�h�4��ryE��؍	�L�h��	u���������)��f�z�����n�����]��I��	�!N���_�$\/L�j]��즟��MT���ؾT)�%���շ8z��	y�VΌ^ �g��[Dz�H���1!��Հ��G��ϲJm�X շ�J��9L�}{���B��;qY��+�%T"h��\ �sE��.؞	��Wx�����!���I�FP�E���������z8��U�O���.wQ3�K�#�xmm��6Ck�<��s�H�/��uZ���l]�$�D�v@�~f��y�NQ�s�d�r��x�YE �j}�I��ߺW��jU������@���\ޟ*jT���[��SтZ�D~�)7+�
J;�L���'H�L.�>S^V���ʊ�\��V�y(d��l(u_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
    //gl_PointSize = a_texcoord0.x;
    v_fragmentColor = vec4(aLcolor0.rgb * a_color0.a * u_alpha.x, a_color0.a * u_alpha.x);
}


#endif

#ifdef FS
$input v_fragmentColor


#include�"../Library/Base/common.sh"


uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniorm mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vLc4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;


void main()
{
    gl_FragColor = v_fragmentColor;
}�


#endif
