�GSN    �/ue��|G���#� �T�R��E���{N�� q�4M��Z���%N�G������  :8�ؗ\6���aTz���
���[���c8>���赵g�so�^r��Ԍtm�C�FÓ}�{��ŵ����g�$O�h㐔�[�D�%����>��r��G�^#ϐ�_�)\><�:%H@�����VI��˗�X<������~<`��(S���X�"��6<i3�7h��>%���͒�]����- �FOE���a��n@�pj�����/|D��#j�afH�Ҙe�Wi��"Ʌwz��G�����|,O<����T�R����-���J{���#S����j]ta��W�6a0˕%D�lDБ%��a��^9���`H�p�<�($�14\��y�Gt�&�`�r��C�p!o�e;�h���}a��ak�$����A{º�R��caEƀ�W�l@M���b�@c�deUt�
L-����/A�eM�ws|҃�����L������l��input v_texcoord1
    #endif
#endif

#ifdef USING_INOUT_FRAGPOS
    #ifdef VS
    $output v_FragPos
    #endif
    #ifdvf FS
    $input v_FragPos
    #endif
#endif

#ifdef USING_INOUT_SHADOWCOORD
    #ifdef VS
    $output v_shadowcoord
   �#endif
    #ifdef FS
    $input v_shadowcoord
    #endif
#endif

#ifdef USING_INOUT_POSITION
#ifdef VS
$output v_positin
#endif
#ifdef FS
$input v_position
#endif
#endif
