�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:ܟ�0���cTrֲ�yjщ�i���9V��߬��`�c;��HR-����-&� m�"��Vu����񷕃�{�6�m}�|����{�n�E����_��0��e�^l���C�@3{x�wA@�����Ğmr�7�뷁x������47k^��lJ4�q�d&���3 +k�'E��>6������~����^V�I���`��!�i���i��,8hڧ"x�lhF����Q^����o��TG�ʚ��n~x���T�XPE�����x���\p��_7��Y�@�͓cY}�E��7\��5Bk�A#��k���� 9���%�q�"�|L�3X��}�_�O�j�F�=�`=`�o5�W�ˋ�>Ɲ����۾`j���Às(9A�ҟ+�	 �M��y�\]p�aV�EE����c�#_�w�ڎׄ�G�]�'g쀈|��nal.glsl"
}


#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#include "Librarj/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.g�sl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentCoor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texCFlor.rgb,1.0);
}

#endif
