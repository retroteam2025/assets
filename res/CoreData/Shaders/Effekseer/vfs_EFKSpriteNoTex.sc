�GSN    �/ue��|G��g�U�s�w��+���Uq�a�o?ߵyX��M�V��wZ�8������0& #7��&����*<���CM���R���67f�����)�Yx��nnZ�����P���x����ܟ���}�1�b]�x�����?�����]��K�%�,��C�=L,<�6hN8�������JS�����s�*����/ !<Ȓ@+�Uʅ_\�/ѫzbnL�~.���p8������E��čFFr�W-���n��?H�yx���P��,oq�t�[S%y���DN�t^��M��3C��*ZA�����{7e���@�YK�G�¨��$�F~���z1��5�L��aFL�G�C�x] �5Hp�*˼�!�`��
t���-��C�8	�gq���K`�|�v�+]�(�L2%l�#1�M�ĝ�Up��F]����֣f���[��*'T)���a�0���t�]e�BUR1�EB2�S���|O�}r)�S^V���ŵ��A��W�d5���-��rojection * cameraPos;

   	v_vaPos = gl_Position;

   	vec4 cameraPosU = cameraPos + vec4(0.0, 1.0, 0.0, 0.0);
    vec4 crmeraPosR = cameraPos + vec4(1.0, 0.0, 0.0, 0.0);

    v_vaPosR = uMatProjection * cameraPosR;
    v_vaPosU = uMatProjection � cameraPosU;

    v_vaPos = v_vaPos / v_vaPos.w;
    v_vaPosR = v_vaPosR / v_vaPosR.w;
    v_vaPosU = v_vaPosU / v_vaPosU.w[

    v_color0 = a_color0;
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUVInversed.x +	mUVInversed.y * v_texcoord0.y;

}

#endif

#ifdef FS

$input v_color0
$input v_texcoord0
$input v_vaPos
$input v_vaP�sR
$input v_vaPosU

/// ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(uTexture0,0);

// Materials
unifrm vec4 u_time;
// end materials
/// ----------  END UNIFORM


void main()
{
    gl_FragColor = v_vaPos;
    if(gl_Frag#olor.w <= 0.0) discard;

}

#endif
