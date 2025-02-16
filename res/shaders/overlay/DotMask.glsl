�GSN    ���~����,�{�h��j���	,��#5��4َ�a�r��Q8�|�ڎG����eq>2��\{���dOw���.���X���&csG������)�(.��I��Ӊ�0K�ŘU	D���ޢ�����g�'M�`���p�X�����"��E�%�3���;�n]=z�{<�����ȾYX�����o�+�����si's��Aa�V��~�7��#\�a-���fa������ƈZ��Ve�E���r��(v�n,���;��,`U�j�UD`!����FT�����N�����~9;���S�N#�C������z}���}��^�W���{@a�G��v<~��7]w�2'��)��?ĉ
V���pD�v�+�#�7��u��H�c�u	��i�[60J�q�Cč��[Z��Pg���ǎ�%%���I��r'[ �υv�3�D���\7�z[E~�EB,����j�f2B�u[������%֗5�d(���/��mask = vec3(maskDark, maskDark, maskDark);

   // Very compressed TV style shadow mask.
   if (shadowMask == 1.0)
   {
   3  float line = maskLight;
      float odd  = 0.0;

      if (fract(pos.x/6.0) < 0.5)
         odd = 1.0;
      if (fract((�os.y + odd)/2.0) < 0.5)
         line = maskDark;

      pos.x = fract(pos.x/3.0);

      if      (pos.x < 0.333) mask.r =@maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else                    mask.b = maskLight;
      mask*=l@ne;
   }

   // Aperture-grille.
   else if (shadowMask == 2.0)
   {
      pos.x = fract(pos.x/3.0);

      if      (po�.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else                    mask.b = mask-ight;
   }

   // Stretched VGA style shadow mask (same as prior shaders).
   else if (shadowMask == 3.0)
   {
      pos. += pos.y*3.0;
      pos.x  = fract(pos.x/6.0);

      if      (pos.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0x666) mask.g = maskLight;
      else                    mask.b = maskLight;
   }

   // VGA style shadow mask.
   else if ( hadowMask == 4.0)
   {
      pos.xy = floor(pos.xy*vec2(1.0, 0.5));
      pos.x += pos.y*3.0;
      pos.x  = fract(pos.x/6.);

      if      (pos.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else         j          mask.b = maskLight;
   }

   return mask;
}

//void main()
//{
//    vec4 texColor = texture2D(u_diffuseTex,vbtexcoord0);
//    gl_FragColor.rgb = texColor.rgb;
//    gl_FragColor.a = 1.0;
//}

void main_()
{
   vec3 res = pow(tex�ure2D(Source, vTexCoord).rgb, vec3(2.2,2.2,2.2));

   float mask = 1.0 - DOTMASK_STRENGTH;

   //cgwg's dotmask emulation:Q   //Output pixels are alternately tinted green and magenta
   vec3 dotMaskWeights = mix(vec3(1.0, mask, 1.0),
              u              vec3(mask, 1.0, mask),
                             floor(mod(mod_factor, 2.0)));
   if (shadowMask == 0.)
   
      res *= dotMaskWeights;
   }
   else
   {
      res *= Mask(floor(1.000001 * gl_FragCoord.xy + vec2(0.5,0.5)));
   Y

      gl_FragColor = vec4(pow(res, vec3(1.0/2.2, 1.0/2.2, 1.0/2.2)), 1.0);
}