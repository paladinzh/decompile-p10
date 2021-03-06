package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

/* compiled from: Unknown */
public class jo implements Creator<jl> {
    static void a(jl jlVar, Parcel parcel, int i) {
        int p = b.p(parcel);
        b.c(parcel, 1, jlVar.getVersionCode());
        b.a(parcel, 2, jlVar.label, false);
        b.a(parcel, 3, jlVar.ZD, i, false);
        b.a(parcel, 4, jlVar.type, false);
        b.a(parcel, 5, jlVar.YM, i, false);
        b.D(parcel, p);
    }

    public jl bj(Parcel parcel) {
        jr jrVar = null;
        int o = a.o(parcel);
        int i = 0;
        String str = null;
        jm jmVar = null;
        String str2 = null;
        while (parcel.dataPosition() < o) {
            int n = a.n(parcel);
            switch (a.S(n)) {
                case 1:
                    i = a.g(parcel, n);
                    break;
                case 2:
                    str2 = a.m(parcel, n);
                    break;
                case 3:
                    jmVar = (jm) a.a(parcel, n, jm.CREATOR);
                    break;
                case 4:
                    str = a.m(parcel, n);
                    break;
                case 5:
                    jrVar = (jr) a.a(parcel, n, jr.CREATOR);
                    break;
                default:
                    a.b(parcel, n);
                    break;
            }
        }
        if (parcel.dataPosition() == o) {
            return new jl(i, str2, jmVar, str, jrVar);
        }
        throw new a.a("Overread allowed size end=" + o, parcel);
    }

    public jl[] cp(int i) {
        return new jl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return bj(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return cp(x0);
    }
}
