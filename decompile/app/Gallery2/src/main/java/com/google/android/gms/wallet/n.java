package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

/* compiled from: Unknown */
public class n implements Creator<OfferWalletObject> {
    static void a(OfferWalletObject offerWalletObject, Parcel parcel, int i) {
        int p = b.p(parcel);
        b.c(parcel, 1, offerWalletObject.getVersionCode());
        b.a(parcel, 2, offerWalletObject.eN, false);
        b.a(parcel, 3, offerWalletObject.Zm, false);
        b.D(parcel, p);
    }

    public OfferWalletObject be(Parcel parcel) {
        String str = null;
        int o = a.o(parcel);
        int i = 0;
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
                    str = a.m(parcel, n);
                    break;
                default:
                    a.b(parcel, n);
                    break;
            }
        }
        if (parcel.dataPosition() == o) {
            return new OfferWalletObject(i, str2, str);
        }
        throw new a.a("Overread allowed size end=" + o, parcel);
    }

    public OfferWalletObject[] ck(int i) {
        return new OfferWalletObject[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return be(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return ck(x0);
    }
}
