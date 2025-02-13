�GSN    �/ue�����*��N�W�����"�q�f8��}:7z؂�e�f��B"����G�΃�72:���,Y��̨BuH��� �����*-2d����ΐ@�NO��J�����
J�E�24O�%�����g�-�O!�ଡ�p�;�.����8��nؤ�)��X�!L<y�KMG	������0�@�˜�SP������}5k��Sa���G�t��\	V�ch���Z.�э���@��ҮP �F �ԥ6��`Q�4N,�����CnD��Vz�BQ9u�ը\I�bY����.��OMP�����hax���R�YYf�]����{���4���f0��W�V���.Bw�
�(�vm8ʸ&@k�&��l�h�c��q)�ƪX�@�-�vL�ty��t�Gq�C�j�MM˦x�#&z�m~�^��گ\J��Vw���䞇^x���9��*'EÓ�w�#�N��*�Ft�:O~b� F�L���g�/`�r-�������w��]�!@柅?��ericColor[1][1],u_sceneHemisphericColor[1][2]);
    vec3 equatorColor = vec3(u_sceneHemisphericColor[2][0],u_sceneHemisphericC|lor[2][1],u_sceneHemisphericColor[2][2]);

    vec3 worldUp = vec3(0.0,1.0,0.0);
    float skyGroundDotMul = 2.5;
    float�minEquatorMix = 0.5;
    float equatorColorBlur = 0.33;

    float upDot = dot(normalVector, worldUp);

    float adjusted$ot = upDot * skyGroundDotMul;
    vec3 skyGroundColor = lerp(groundColor, skyColor, saturate((adjustedDot + 1.0) * 0.5));

 	  //Work out equator lights brightness
    float equatorBright = saturate(dot(equatorColor, equatorColor));

    //Blur equa�or color with sky and ground colors based on how bright it is.
    vec3 equatorBlurredColor = lerp(equatorColor, saturate(equaorColor + groundColor + skyColor), equatorBright * equatorColorBlur);

    //Work out 3 way lerp inc equator light
    float@smoothDot = pow(abs(upDot), 1.0);
    vec3 equatorColor2 = lerp(equatorBlurredColor, groundColor, smoothDot) * step(upDot, 0) } lerp(equatorBlurredColor, skyColor, smoothDot) * step(0, upDot);


    return lerp(skyGroundColor, equatorColor2, saturate(6quatorBright + minEquatorMix)) * 0.75;

    //return groundColor * -normalVector.y + skyColor * normalVector.y + equatorColor* (1,0 - abs(normalVector.y));
}


float GetDiffuseDirectionLight(vec3 normal)
{
    vec3 dir = -u_lightDirection.xyz;
 j  return max(dot(normal,normalize(dir) ), 0.0);
}

float GetDiffuseLight(vec3 normal)
{
    vec3 dir = -u_lightDirection.xDz;
    return max(dot(normal,normalize(dir) ), 0.0);
}

vec3 GetEnvironmentColor(vec3 normal)
{
    float ambientStrenght�= u_ambientColor.w;
    return ComputeHemisphericLight(normal);
}

float GetLightShadow()
{
    #ifdef RECEIVED_SHADOW
 {      return GetShadow();
    #else
        return 1.0;
    #endif
}

vec3 GetLightColor(vec3 normal)
{
    int lightTy%e = int(u_lightInfo.x);

    float diff = (lightType == DIRECTION_LIGHT)?GetDiffuseDirectionLight(normal):GetDiffuseLight(noral);
    float shadow = GetLightShadow();
    return diff * shadow * u_lightColor.rgb;
}


