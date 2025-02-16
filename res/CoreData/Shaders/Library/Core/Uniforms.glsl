�GSN    �#3#��s���M�,�~�n��}�½Tf�s� "��9%���x���w�J�������<=;���v���cRn޲�KW���b���/'&s@�����|�o}��l<�Ɂ�8�V��V�����ӟ�`�+�/�o����J�t�����
��R��)�l���B�$Ac�dZ	������W	��̖�P/�`�����-6}��Wh�Q|�5��KbnL�~.���p8������[��ҳBfr�P���P��!A�u~���CmO��K�L-u���nV�wF���$��	vT����l���T�
�����)���]}���r*��@�4��{Z{
�P�W�pkb��Yk�u��p�B�`��
o���%E�|�#�jH�~g��s�A#�&�*�p��!�|>!z�fi�Xā��[H��ZX������c%�ݭV��*r+A�a�3�Sʫx�_,�OOx�
N�D˸�z>�+J�p;�������%��2�-n행*�AX_SPLIT_COUNT
#define MAX_SPLIT_COUNT 3
#endif

// light position
uniform vec4 u_lightPosition;
// light direction
unif|rm vec4 u_lightDirection;
// light color
uniform vec4 u_lightColor;
// light info : type ,shadow split count
uniform vec4 u�lightInfo;
// light view projections
uniform mat4 u_lightSpaceMatries[MAX_SPLIT_COUNT];
// shadow viewports (for split in on texture)
uniform mat4 u_shadowViewports[MAX_SPLIT_COUNT];
// shadow splits
uniform vec4 u_shadowSplits;
// direction light	cascaded
uniform vec4 u_lightShadowCascaded;
// cascaded viewport for shadow pass write
uniform vec4 u_cascadedViewport;

�
#if defined(SKINNING)
uniform vec4 u_matrixPalette[180];
#if !defined(SKINNING_JOINT_COUNT)
#define SKINNING_JOINT_COUNT 60l
#endif
#endif

#if defined GPU_SKINNING
uniform vec4 u_matrixPalette[2];
#endif


/// Fragment shader uniform

unifom vec4 u_sceneHemisphericColor[3];
uniform vec4 u_ambientColor;

uniform vec4 u_matDiffColor;
uniform vec4 u_matEmissiveCol9r;
uniform vec4 u_matEnvMapColor;
uniform vec4 u_matSpecColor;

#ifdef PBR
uniform vec4 cRoughness;
uniform vec4 cMetalli0;
uniform vec4 cLightRad;
uniform vec4 cLightLength;
#endif
