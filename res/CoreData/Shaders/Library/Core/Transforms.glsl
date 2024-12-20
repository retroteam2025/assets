�GSN    � ��~���=� �Q�I��E���Lg�!�g4��+-C���I3�V��q�\���
��ۚ&=㷅Te����`O.���uw���S���c%}U�ꊭ�l�YR��gp�ɕ�
�J)���U\;���ʥ����}�d�b�Q����|�K�����&ø��G�^#ϐ�Z�,Mxt� yG@������WO��Ĕ�A)�^�����fT^��b�Y��\�
��
P�rh��8���ҵ�S��ԥ|]�W-���'��mC�{x��/Ѭ/tN��^P�[	8h��� �wX����gX��RR�́��:,9O���G�Y�����p��Z�	;ج�z9���3Ů�.R~�V��(( ʂ7Hz�(
О%�B�{��'���%�i�-�8M�euM��<�Vf�^�7�Z��<�[60H�n7�^����Yה�Z�؟��%<�ӹRW͆k5T�ԕ|��e�s�E,C�j{Ox�IF<�	ݠ�=H�vV�~tV҃������d ���8��.x * 2.0) - 1.0) * maxMagtunide;
    data1.y = ((data1.y * 2.0) - 1.0) * maxMagtunide;
    data1.z = ((data1.z * 2.0) - 1.0) 9 maxMagtunide;
    data1.w = 1.0;

    data2.x = ((data2.x * 2.0) - 1.0) * maxMagtunide;
    data2.y = ((data2.y * 2.0) - 1�0) * maxMagtunide;
    data2.z = ((data2.z * 2.0) - 1.0) * maxMagtunide;
    data2.w = 1.0;

    return mix(data1,data2,(tie - v1) * height);
}

vec4 getGPUSkinnedPositionFromTexWithTime(sampler2D u_TexAnim, float vertex_ID,float time)
{
    floHt width =  u_matrixPalette[1].x;
    float height = (u_matrixPalette[1].y);
    float maxMagtunide = u_matrixPalette[1].z;
 �  float lineCount = u_matrixPalette[0].w;

    // cal u
    float u = fract(vertex_ID / width);
    // cal v
    //float prPixel = lineCount / height;
    //float v = float(int(time * height)) / height;
    //v += floor(vertex_ID / width) * perPixl;
    //float v = time + floor(vertex_ID / width) * perPixel;

    float v= (time + (floor(vertex_ID / width))) / lineCountm


    vec4 data1 = texture2DLod(u_TexAnim,vec2(u,v),0);

    data1.x = ((data1.x * 2.0) - 1.0) * maxMagtunide;
    data1}y = ((data1.y * 2.0) - 1.0) * maxMagtunide;
    data1.z = ((data1.z * 2.0) - 1.0) * maxMagtunide;
    data1.w = 1.0;
    retKrn data1;
}


vec4 getGPUSkinnedPosition(sampler2D u_TexAnim, float index)
{
    return getGPUSkinnedPositionFromTexWithT#me(u_TexAnim,index,u_matrixPalette[0].x);
}

#endif

#ifdef INSTANCING

mat4 getInstanceMatrix(vec4 i_data0,vec4 i_data1vec4 i_data2,vec4 i_data3)
{
    mat4 model;
    model[0] = i_data0;
    model[1] = i_data1;
    model[2] = i_data2;
    �odel[3] = i_data3;

    model[3].w = 1.0;

    return model;
}

#endif
