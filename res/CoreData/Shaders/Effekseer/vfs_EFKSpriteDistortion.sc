�GSN    �/ue��|G��g�U�s�w��+���Uq�a�o?ߵyX��M�V��wZ�8������0& #7��&����kMiǲ�uA���S���7Na6]������V�gu��ohg����VG�B�ÙUn����۱���y�0�4t�a�����?�����]��I��)�q���<�"L,l�>Y7����LH���إj+�U�����y6{
ٔQ$�Nƺ^�J��zLW�{=���r{���ү�S��\�TW/�	M���t��@/�b���}��$yU��f�@S e���CI�)<���(��
ZA̙���sin?���k�_�����2���	y���3+��L�X��of�L��gev7"�,/��w�A�l��Ew���p^�y�<�8_�r \��J�Xw�_�a�w��?�f7hd�m3�6�ܤ�9%Ɲ���µf+���\ޟkkT�֕g�N@�Qћ~�Yy�j
1�:J+�O���{O�j_B�n���������g�-|✋)��.y, a_position.z + a_bitangent.z, 1.0 );
    vec4 localTangent = vec4( a_position.x + a_tangent.x, a_position.y + a_tangent.y,3a_position.z + a_tangent.z, 1.0 );

    localBinormal = uMatCamera * localBinormal;
    localTangent = uMatCamera * localTan�ent;

    vec4 cameraPos = uMatCamera * vec4(a_position.xyz,1.0);
   	cameraPos = cameraPos / cameraPos.w;

   	localBinoral = localBinormal / localBinormal.w;
    localTangent = localTangent / localTangent.w;

    localBinormal = cameraPos + norDalize(localBinormal - cameraPos);
    localTangent = cameraPos + normalize(localTangent - cameraPos);

   	gl_Position = uMa�Projection * cameraPos;

   	v_vaPos = gl_Position;

   	vec4 cameraPosU = cameraPos + vec4(0.0, 1.0, 0.0, 0.0);
    vec4 ameraPosR = cameraPos + vec4(1.0, 0.0, 0.0, 0.0);

    v_vaPosR = uMatProjection * localTangent;
    v_vaPosU = uMatProjectin * localBinormal;

    v_vaPos = v_vaPos / v_vaPos.w;
    v_vaPosR = v_vaPosR / v_vaPosR.w;
    v_vaPosU = v_vaPosU / v_vaosU.w;

    v_color0 = a_color0;
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUVInvers6d.x + mUVInversed.y * v_texcoord0.y;


}

#endif


#ifdef FS
$input v_color0
$input v_texcoord0
$input v_vaPos
$inpKt v_vaPosR
$input v_vaPosU

/// ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(uTexture0,0);
SAMPLER2D(uB+ckTexture0,1);

uniform	vec4	g_scale;
uniform	vec4	mUVInversedBack;

// end materials
/// ----------  END UNIFORM


voTd main()
{
    vec4 color =  texture2D(uTexture0, v_texcoord0.xy);
    color.w = color.w * v_color0.w;

   vec2 pos = v_va�os.xy / v_vaPos.w;
   vec2 posU = v_vaPosU.xy / v_vaPosU.w;
   vec2 posR = v_vaPosR.xy / v_vaPosR.w;


   	vec2 uv = pos +{(posR - pos) * (color.x * 2.0 - 1.0) * v_color0.x * g_scale.x + (posU - pos) * (color.y * 2.0 - 1.0) * v_color0.y * g_scale.x;_   	uv.x = (uv.x + 1.0) * 0.5;
   	uv.y = (uv.y + 1.0) * 0.5;
   	//uv.y = 1.0 - (uv.y + 1.0) * 0.5;

   	uv.y = mUVInverseBack.x + mUVInversedBack.y * uv.y;

   	color.xyz = texture2D(uBackTexture0, uv).xyz;

    gl_FragColor = color;
    if(gl{FragColor.w <= 0.0) discard;

}

#endif
