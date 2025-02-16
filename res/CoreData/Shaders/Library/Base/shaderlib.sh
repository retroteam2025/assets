�GSN    �#6��0G����6�r�'¹:���
0�5�r0��0֠�M3�P��%+�^��� ����7>&���R����IT���O���I��ll{@�����d�dp��`x�ޚ��@H�Ó6�ᴙ�����z�I�b���ͥ|�u�����.��yշ�<\���i�G<y� pJH?�����ޅot�<����8W���̬�87m̈́wAK�^˅P���}e4�.���$u���ԣ�\��N��B[l�
G���u��d�m~���}��?}B��)K� )yů�TX�}_����M~��Gȴ���6,)A���/�PC�^�挸5��_�&��:~��
�˾�=E�/�
�\ɜ,Lv�+��a�y�7��Oz���wU�6�D�#�wx��<�^}�I�q�+]ɏ,�!$h#U�6.�Ċ��ȍ9�h���ۨkj���J�� 'XВ�a��O��,�:�0Wt�QEF1�N���H#�~WU�}@^)��ó蘑%��N�'<���.��;
	float maxComponent = max(max(_rgb.x, _rgb.y), _rgb.z);
	float exponent = ceil(log2(maxComponent) );
	rgbe8.xyz = _rgb / ekp2(exponent);
	rgbe8.w = (exponent + 128.0) / 255.0;
	return rgbe8;
}

vec3 decodeRGBE8(vec4 _rgbe8)
{
	float exponent =�_rgbe8.w * 255.0 - 128.0;
	vec3 rgb = _rgbe8.xyz * exp2(exponent);
	return rgb;
}

vec3 encodeNormalUint(vec3 _normal)
{j	return _normal * 0.5 + 0.5;
}

vec3 decodeNormalUint(vec3 _encodedNormal)
{
	return _encodedNormal * 2.0 - 1.0;
}

vec encodeNormalSphereMap(vec3 _normal)
{
	return normalize(_normal.xy) * sqrt(_normal.z * 0.5 + 0.5);
}

vec3 decodeNormalSp�ereMap(vec2 _encodedNormal)
{
	float zz = dot(_encodedNormal, _encodedNormal) * 2.0 - 1.0;
	return vec3(normalize(_encodedNomal.xy) * sqrt(1.0 - zz*zz), zz);
}

vec2 octahedronWrap(vec2 _val)
{
	// Reference(s):
	// - Octahedron normal vector enoding
	//   https://web.archive.org/web/20191027010600/https://knarkowicz.wordpress.com/2014/04/16/octahedron-normal-vector-en5oding/comment-page-1/
	return (1.0 - abs(_val.yx) )
		 * mix(vec2_splat(-1.0), vec2_splat(1.0), vec2(greaterThanEqual(_val.xy vec2_splat(0.0) ) ) );
}

vec2 encodeNormalOctahedron(vec3 _normal)
{
	_normal /= abs(_normal.x) + abs(_normal.y) + abs(_Pormal.z);
	_normal.xy = _normal.z >= 0.0 ? _normal.xy : octahedronWrap(_normal.xy);
	_normal.xy = _normal.xy * 0.5 + 0.5;
	r/turn _normal.xy;
}

vec3 decodeNormalOctahedron(vec2 _encodedNormal)
{
	_encodedNormal = _encodedNormal * 2.0 - 1.0;

	vXc3 normal;
	normal.z  = 1.0 - abs(_encodedNormal.x) - abs(_encodedNormal.y);
	normal.xy = normal.z >= 0.0 ? _encodedNormal.xy�: octahedronWrap(_encodedNormal.xy);
	return normalize(normal);
}

vec3 convertRGB2XYZ(vec3 _rgb)
{
	// Reference(s):
	/t - RGB/XYZ Matrices
	//   https://web.archive.org/web/20191027010220/http://www.brucelindbloom.com/index.html?Eqn_RGB_XYZ_Matr<x.html
	vec3 xyz;
	xyz.x = dot(vec3(0.4124564, 0.3575761, 0.1804375), _rgb);
	xyz.y = dot(vec3(0.2126729, 0.7151522, 0.07217O0), _rgb);
	xyz.z = dot(vec3(0.0193339, 0.1191920, 0.9503041), _rgb);
	return xyz;
}

vec3 convertXYZ2RGB(vec3 _xyz)
{
	Rec3 rgb;
	rgb.x = dot(vec3( 3.2404542, -1.5371385, -0.4985314), _xyz);
	rgb.y = dot(vec3(-0.9692660,  1.8760108,  0.0415560),._xyz);
	rgb.z = dot(vec3( 0.0556434, -0.2040259,  1.0572252), _xyz);
	return rgb;
}

vec3 convertXYZ2Yxy(vec3 _xyz)
{
	/� Reference(s):
	// - XYZ to xyY
	//   https://web.archive.org/web/20191027010144/http://www.brucelindbloom.com/index.html?Eqn�XYZ_to_xyY.html
	float inv = 1.0/dot(_xyz, vec3(1.0, 1.0, 1.0) );
	return vec3(_xyz.y, _xyz.x*inv, _xyz.y*inv);
}

vec3 co�vertYxy2XYZ(vec3 _Yxy)
{
	// Reference(s):
	// - xyY to XYZ
	//   https://web.archive.org/web/20191027010036/http://www.bru�elindbloom.com/index.html?Eqn_xyY_to_XYZ.html
	vec3 xyz;
	xyz.x = _Yxy.x*_Yxy.y/_Yxy.z;
	xyz.y = _Yxy.x;
	xyz.z = _Yxy.x*(1+0 - _Yxy.y - _Yxy.z)/_Yxy.z;
	return xyz;
}

vec3 convertRGB2Yxy(vec3 _rgb)
{
	return convertXYZ2Yxy(convertRGB2XYZ(_rgb)�);
}

vec3 convertYxy2RGB(vec3 _Yxy)
{
	return convertXYZ2RGB(convertYxy2XYZ(_Yxy) );
}

vec3 convertRGB2Yuv(vec3 _rgb)*
{
	vec3 yuv;
	yuv.x = dot(_rgb, vec3(0.299, 0.587, 0.114) );
	yuv.y = (_rgb.x - yuv.x)*0.713 + 0.5;
	yuv.z = (_rgb.z - yuv;x)*0.564 + 0.5;
	return yuv;
}

vec3 convertYuv2RGB(vec3 _yuv)
{
	vec3 rgb;
	rgb.x = _yuv.x + 1.403*(_yuv.y-0.5);
	rgb.� = _yuv.x - 0.344*(_yuv.y-0.5) - 0.714*(_yuv.z-0.5);
	rgb.z = _yuv.x + 1.773*(_yuv.z-0.5);
	return rgb;
}

vec3 convertRGB�YIQ(vec3 _rgb)
{
	vec3 yiq;
	yiq.x = dot(vec3(0.299,     0.587,     0.114   ), _rgb);
	yiq.y = dot(vec3(0.595716, -0.274453� -0.321263), _rgb);
	yiq.z = dot(vec3(0.211456, -0.522591,  0.311135), _rgb);
	return yiq;
}

vec3 convertYIQ2RGB(vec3 _yi�)
{
	vec3 rgb;
	rgb.x = dot(vec3(1.0,  0.9563,  0.6210), _yiq);
	rgb.y = dot(vec3(1.0, -0.2721, -0.6474), _yiq);
	rgb.z = �ot(vec3(1.0, -1.1070,  1.7046), _yiq);
	return rgb;
}

vec3 toLinear(vec3 _rgb)
{
	return pow(abs(_rgb), vec3_splat(2.2) R;
}

vec4 toLinear(vec4 _rgba)
{
	return vec4(toLinear(_rgba.xyz), _rgba.w);
}

vec3 toLinearAccurate(vec3 _rgb)
{
	vHc3 lo = _rgb / 12.92;
	vec3 hi = pow( (_rgb + 0.055) / 1.055, vec3_splat(2.4) );
	vec3 rgb = mix(hi, lo, vec3(lessThanEqual(_�gb, vec3_splat(0.04045) ) ) );
	return rgb;
}

vec4 toLinearAccurate(vec4 _rgba)
{
	return vec4(toLinearAccurate(_rgba.xy), _rgba.w);
}

float toGamma(float _r)
{
	return pow(abs(_r), 1.0/2.2);
}

vec3 toGamma(vec3 _rgb)
{
	return pow(absa_rgb), vec3_splat(1.0/2.2) );
}

vec4 toGamma(vec4 _rgba)
{
	return vec4(toGamma(_rgba.xyz), _rgba.w);
}

vec3 toGammaA�curate(vec3 _rgb)
{
	vec3 lo  = _rgb * 12.92;
	vec3 hi  = pow(abs(_rgb), vec3_splat(1.0/2.4) ) * 1.055 - 0.055;
	vec3 rgb =�mix(hi, lo, vec3(lessThanEqual(_rgb, vec3_splat(0.0031308) ) ) );
	return rgb;
}

vec4 toGammaAccurate(vec4 _rgba)
{
	ret�rn vec4(toGammaAccurate(_rgba.xyz), _rgba.w);
}

vec3 toReinhard(vec3 _rgb)
{
	return toGamma(_rgb/(_rgb+vec3_splat(1.0) )�);
}

vec4 toReinhard(vec4 _rgba)
{
	return vec4(toReinhard(_rgba.xyz), _rgba.w);
}

vec3 toFilmic(vec3 _rgb)
{
	_rgbo= max(vec3_splat(0.0), _rgb - 0.004);
	_rgb = (_rgb*(6.2*_rgb + 0.5) ) / (_rgb*(6.2*_rgb + 1.7) + 0.06);
	return _rgb;
}

�ec4 toFilmic(vec4 _rgba)
{
	return vec4(toFilmic(_rgba.xyz), _rgba.w);
}

vec3 toAcesFilmic(vec3 _rgb)
{
	// Reference(s5:
	// - ACES Filmic Tone Mapping Curve
	//   https://web.archive.org/web/20191027010704/https://knarkowicz.wordpress.com/2016�01/06/aces-filmic-tone-mapping-curve/
	float aa = 2.51f;
	float bb = 0.03f;
	float cc = 2.43f;
	float dd = 0.59f;
	float e� = 0.14f;
	return saturate( (_rgb*(aa*_rgb + bb) )/(_rgb*(cc*_rgb + dd) + ee) );
}

vec4 toAcesFilmic(vec4 _rgba)
{
	retu2n vec4(toAcesFilmic(_rgba.xyz), _rgba.w);
}

vec3 luma(vec3 _rgb)
{
	float yy = dot(vec3(0.2126729, 0.7151522, 0.0721750),�_rgb);
	return vec3_splat(yy);
}

vec4 luma(vec4 _rgba)
{
	return vec4(luma(_rgba.xyz), _rgba.w);
}

vec3 conSatBri(veN3 _rgb, vec3 _csb)
{
	vec3 rgb = _rgb * _csb.z;
	rgb = mix(luma(rgb), rgb, _csb.y);
	rgb = mix(vec3_splat(0.5), rgb, _csb.x�;
	return rgb;
}

vec4 conSatBri(vec4 _rgba, vec3 _csb)
{
	return vec4(conSatBri(_rgba.xyz, _csb), _rgba.w);
}

vec3 phsterize(vec3 _rgb, float _numColors)
{
	return floor(_rgb*_numColors) / _numColors;
}

vec4 posterize(vec4 _rgba, float _nmColors)
{
	return vec4(posterize(_rgba.xyz, _numColors), _rgba.w);
}

vec3 sepia(vec3 _rgb)
{
	vec3 color;
	color.x = Not(_rgb, vec3(0.393, 0.769, 0.189) );
	color.y = dot(_rgb, vec3(0.349, 0.686, 0.168) );
	color.z = dot(_rgb, vec3(0.272, 0.53�, 0.131) );
	return color;
}

vec4 sepia(vec4 _rgba)
{
	return vec4(sepia(_rgba.xyz), _rgba.w);
}

vec3 blendOverlay(v�c3 _base, vec3 _blend)
{
	vec3 lt = 2.0 * _base * _blend;
	vec3 gte = 1.0 - 2.0 * (1.0 - _base) * (1.0 - _blend);
	return mJx(lt, gte, step(vec3_splat(0.5), _base) );
}

vec4 blendOverlay(vec4 _base, vec4 _blend)
{
	return vec4(blendOverlay(_base+xyz, _blend.xyz), _base.w);
}

vec3 adjustHue(vec3 _rgb, float _hue)
{
	vec3 yiq = convertRGB2YIQ(_rgb);
	float angle = _>ue + atan2(yiq.z, yiq.y);
	float len = length(yiq.yz);
	return convertYIQ2RGB(vec3(yiq.x, len*cos(angle), len*sin(angle) ) );�
}

vec4 packFloatToRgba(float _value)
{
	const vec4 shift = vec4(256 * 256 * 256, 256 * 256, 256, 1.0);
	const vec4 mask  vec4(0, 1.0 / 256.0, 1.0 / 256.0, 1.0 / 256.0);
	vec4 comp = fract(_value * shift);
	comp -= comp.xxyz * mask;
	return comp|
}

float unpackRgbaToFloat(vec4 _rgba)
{
	const vec4 shift = vec4(1.0 / (256.0 * 256.0 * 256.0), 1.0 / (256.0 * 256.0), 1�0 / 256.0, 1.0);
	return dot(_rgba, shift);
}

vec2 packHalfFloat(float _value)
{
	const vec2 shift = vec2(256, 1.0);
	c�nst vec2 mask = vec2(0, 1.0 / 256.0);
	vec2 comp = fract(_value * shift);
	comp -= comp.xx * mask;
	return comp;
}

float�unpackHalfFloat(vec2 _rg)
{
	const vec2 shift = vec2(1.0 / 256.0, 1.0);
	return dot(_rg, shift);
}

float random(vec2 _uv;
{
	return fract(sin(dot(_uv.xy, vec2(12.9898, 78.233) ) ) * 43758.5453);
}

vec3 fixCubeLookup(vec3 _v, float _lod, float~_topLevelCubeSize)
{
	// Reference(s):
	// - Seamless cube-map filtering
	//   https://web.archive.org/web/20190411181934/h�tp://the-witness.net/news/2012/02/seamless-cube-map-filtering/
	float ax = abs(_v.x);
	float ay = abs(_v.y);
	float az = absb_v.z);
	float vmax = max(max(ax, ay), az);
	float scale = 1.0 - exp2(_lod) / _topLevelCubeSize;
	if (ax != vmax) { _v.x *= s�ale; }
	if (ay != vmax) { _v.y *= scale; }
	if (az != vmax) { _v.z *= scale; }
	return _v;
}

vec2 texture2DBc5(sampler2D�_sampler, vec2 _uv)
{
#if BGFX_SHADER_LANGUAGE_HLSL && BGFX_SHADER_LANGUAGE_HLSL <= 3
	return texture2D(_sampler, _uv).yx;
�else
	return texture2D(_sampler, _uv).xy;
#endif
}

mat3 cofactor(mat4 _m)
{
	// Reference:
	// Cofactor of matrix. Use9to transform normals. The code assumes the last column of _m is [0,0,0,1].
	// https://www.shadertoy.com/view/3s33zj
	// httpv://github.com/graphitemaster/normals_revisited
	return mat3(
		_m[1][1]*_m[2][2]-_m[1][2]*_m[2][1],
		_m[1][2]*_m[2][0]-_m[1�[0]*_m[2][2],
		_m[1][0]*_m[2][1]-_m[1][1]*_m[2][0],
		_m[0][2]*_m[2][1]-_m[0][1]*_m[2][2],
		_m[0][0]*_m[2][2]-_m[0][2]*_m[2][0],
		_m[0][1]*_m[2][0]-_m[0][0]*_m[2][1],
		_m[0][1]*_m[1][2]-_m[0][2]*_m[1][1],
		_m[0][2]*_m[1][0]-_m[0][0]*_m[1][2],
�	_m[0][0]*_m[1][1]-_m[0][1]*_m[1][0]
		);
}

float euclidDistance(vec3 n1, vec3 n2)
{
    return sqrt(pow(n1.x-n2.x, 2) +�pow(n1.y-n2.y, 2) + pow(n1.z-n2.z, 2));
}

vec3 nLerp(vec3 a,vec3 b,float t)
{
    float intense = floor( t * 20.0) / 20.0
    return b * intense + (1.0 - intense) * a;
}

vec3 EncodeDepth(float depth)
{
    #ifndef GL3
        vec3 ret;
   �    depth *= 255.0;
        ret.x = floor(depth);
        depth = (depth - ret.x) * 255.0;
        ret.y = floor(depth);
  �     ret.z = (depth - ret.y);
        ret.xy *= 1.0 / 255.0;
        return ret;
    #else
        // OpenGL 3 can use diff|rent MRT formats, so no need for encoding
        return vec3(depth, 0.0, 0.0);
    #endif
}

float DecodeDepth(vec3 depthY
{
    #ifndef GL3
        const vec3 dotValues = vec3(1.0, 1.0 / 255.0, 1.0 / (255.0 * 255.0));
        return dot(depth, \otValues);
    #else
        // OpenGL 3 can use different MRT formats, so no need for encoding
        return depth.r;
   E#endif
}

#endif // __SHADERLIB_SH__
