�GSN    �/ue��|G��g�U�5�'��{���0!�p�i?��-7fڞ�i�|¨I�W�����!:֑�3DЛ��&Tr���NF���T���1:DDQ����زy�r5��rpH����VH�CK�ֈq���¿����@��e�[����M�T�9�댈^��^��.�^!���D�?@wJ�gF������)0�L��ؐZ0�j߼��4?aĒ(S�JƄB�5��PAJ�>E��>6������~����^C�O���k��o(�ny���`��inD��VL�MH m��CD�w_����Mz߰RQ�����2%e����PD�����5�� �Fzح�e?��Y�M��.2C���e{l��4Zu�+��v�O�l��+���5�(�,�tE�~u��r�WXw�X�}�e��,�"4$z��1ć��YN��Y����ǿrj��G��XO�ŜR�D�,��7�\8�TSSb�EL3�OŢ�A�f_N�z �����ϱ���u&���A��   modelView[0][1] = 0.0; 
    modelView[0][2] = 0.0; 

    // Second colunm.
    modelView[1][0] = 0.0; 
    modelView[1]H1] = 1.0; 
    modelView[1][2] = 0.0; 

    // Thrid colunm.
    modelView[2][0] = 0.0; 
    modelView[2][1] = 0.0; 
    �odelView[2][2] = 1.0;

    // fixed-size billboard
    // https://stackoverflow.com/questions/41767490/how-to-transform-vert	ces-in-vertex-shader-to-get-a-3d-billboard

    vec4 viewPos = mul(u_modelView, u_billboardCenter);
    float dist = -viewPoZ.z * 0.005;
    //gl_Position = mul(u_proj, (viewPos + vec4(a_position.xy*dist, 0, 0)));
    
    gl_Position = mul(u_proj, �ul(modelView, vec4(a_position.xyz * dist, 1.0)));

    #include "Library/Macro/Texcoord0Final.glsl"
}

#endif

#ifdef FSl

/// input
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )m
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTexz v_texcoord0);
    gl_FragColor = vec4(texColor.rgb, texColor.a);
}

#endif
