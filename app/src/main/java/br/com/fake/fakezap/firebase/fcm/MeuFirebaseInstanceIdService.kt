package br.com.fake.fakezap.firebase.fcm

import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService
import com.orhanobut.hawk.Hawk

/**
 * Created by logonrm on 19/03/2018.
 */
class MeuFirebaseInstanceIdService : FirebaseInstanceIdService(){

    override fun onTokenRefresh() {
        super.onTokenRefresh()
        Hawk.put("TOKENFIREBASE",FirebaseInstanceId.getInstance().token)
    }

}