�GSN    �/ue��|G��g�6�j�s��T���Sv�z�,q��)K�Hg���r�U���G��ʣ;>'���#x���i0���^S꺙K���; }F������}�so�^p�����)�h��x��������`�6�0R�L����v�v�����_��0��$�l�݆[�9x_�6Nb	��ɦ���MT���ؾT)�%���Ք1-g(��RT>�LՃI)�ȫz
P�x:��1!������d��ҩ_	�I��j��,Q�4'O���_��=jH��{3�AH*n���\A�&��2ִ+��^B�����n~p����!�@����6��G�jW���a3��u�M��59�K��x( ʓwA�>��`�&�z��Lv��sU�+��Gz�@��'�p[|�J�w�6�}�LJ�Wr�^ߪ��ZF��GY������F���\��;<y*����lC	�G׆r�c8^�\soV�/*j�~���A5�pO.�1\^#�������%֙V�"g��:��4 u_matrixPalette[SKINNING_JOINT_COUNT * 3];

uniform vec3 u_sceneHemisphericColor[3];
uniform vec4 u_lightDirection;
unifoam vec4 u_lightColor;


vec4 getPosition(vec4 a_blendWeight,vec4 a_blendIndex,vec3 a_position)
{
    float blendWeight = a_�lendWeight[0];

    int matrixIndex = int (a_blendIndex[0]) * 3;
    vec4 matrixPalette1 = mul(u_matrixPalette[matrixIndex] L blendWeight);
    vec4 matrixPalette2 = mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
    vec4 matrixPalette3 = mul(uvmatrixPalette[matrixIndex + 2] , blendWeight);


    blendWeight = a_blendWeight[1];
    if (blendWeight > 0.0)
    {
   �    matrixIndex = int(a_blendIndex[1]) * 3;
        matrixPalette1 += mul(u_matrixPalette[matrixIndex] , blendWeight);
      A matrixPalette2 += mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
        matrixPalette3 += mul(u_matrixPalette[matrixInex + 2] , blendWeight);

        blendWeight = a_blendWeight[2];
        if (blendWeight > 0.0)
        {
            matr?xIndex = int(a_blendIndex[2]) * 3;
            matrixPalette1 += mul(u_matrixPalette[matrixIndex] , blendWeight);
           smatrixPalette2 += mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
            matrixPalette3 += mul(u_matrixPalette[matriFIndex + 2] , blendWeight);

            blendWeight = a_blendWeight[3];
            if (blendWeight > 0.0)
            {
 j              matrixIndex = int(a_blendIndex[3]) * 3;
                matrixPalette1 += mul(u_matrixPalette[matrixIndex] , bleSdWeight);
                matrixPalette2 += mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
                matrixPalett�3 += mul(u_matrixPalette[matrixIndex + 2] , blendWeight);
            }
        }
    }

    vec4 _skinnedPosition;
    v>c4 position = vec4(a_position, 1.0);
    _skinnedPosition.x = dot(position, matrixPalette1);
    _skinnedPosition.y = dot(pos<tion, matrixPalette2);
    _skinnedPosition.z = dot(position, matrixPalette3);
    _skinnedPosition.w = position.w;

    reurn _skinnedPosition;
}

uniform mat4 u_viewProjMatrix;

void main()
{
    gl_Position = mul(mul(u_viewProj,CC_MVMatrix), getPosition(a_weight,a_indices,a_position.xyz));
    v_texCoord = a_texcoord0;
    v_texCoord.y = 1.0 - v_texCoord.y;

  . vec3 _normalVector = a_normal;

}



#endif

#ifdef FS
$input v_texCoord
$input v_lightColor

#include "../Library�Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_M�PMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime�
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);

uniform vec4 u_color;


void main()
�
    gl_FragColor = vec4(texture2D(CC_Texture0, v_texCoord).rgb ,1.0);
}


#endif
