�GSN    �/ue��|G��g�6�j�s��T���Sv�z�,q��)K�Hg���k�_���m�ֹ'{"Ѧ�U���7��CE�����wc(Qk�����q���hz�Е��Cg�:�r���������q�p�y&�{����g�;�
���>��k݄>�{Խ�C�$_7n�IsNT����͇n\�����?(�l�����08zJ��f[>�TӃg�0�� "M�~0���kX��ҫ�@����C�9"O��k��9W�l_���f��;u��lbU��
-�g_���g��Sv�����Net
���S�B�K����o��7�j{���~;Գ2�W��|Y2�A�W�VWΞ'Bo�Pu����a��_}���+�S�,�y[�>V��3�C�B�v�4p��C�a:.f�#m�XЇ܀GL��P|����ƿw#���\ީ9ZO-�՞m�	 �Wۋ#�E,{�uRUU� @+�NƷ��/L�sS������O��{�(g���F��
uniform mat4 u_viewProjMatrix;

void main()
{
    gl_Position = mul(mul(u_viewProj,CC_MVMatrix) , vec4(a_position.xyz, 1.#));
    v_texCoord = a_texcoord0;
    v_texCoord.y = 1.0 - v_texCoord.y;

    vec3 _normalVector = a_normal;
}



#end�f

#ifdef FS
$input v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViePMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NorDalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (C�_Texture0,0);

uniform vec4 u_color;


void main()
{
    gl_FragColor = vec4(texture2D(CC_Texture0, v_texCoord).rgb,1.0)Z
}


#endif
