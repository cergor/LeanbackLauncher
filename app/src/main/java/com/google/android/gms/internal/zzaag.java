package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.zza;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultStore;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.zzac;
import java.util.concurrent.TimeUnit;

public class zzaag<R extends Result>
  extends PendingResult<R>
{
  private final Status zzaiT;
  
  public zzaag(Status paramStatus)
  {
    zzac.zzb(paramStatus, "Status must not be null");
    if (!paramStatus.isSuccess()) {}
    for (boolean bool = true;; bool = false)
    {
      zzac.zzb(bool, "Status must not be success");
      this.zzaiT = paramStatus;
      return;
    }
  }
  
  @NonNull
  public R await()
  {
    throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
  }
  
  @NonNull
  public R await(long paramLong, @NonNull TimeUnit paramTimeUnit)
  {
    throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
  }
  
  public void cancel()
  {
    throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
  }
  
  @NonNull
  Status getStatus()
  {
    return this.zzaiT;
  }
  
  public boolean isCanceled()
  {
    throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
  }
  
  public void setResultCallback(@NonNull ResultCallback<? super R> paramResultCallback)
  {
    throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
  }
  
  public void setResultCallback(@NonNull ResultCallback<? super R> paramResultCallback, long paramLong, @NonNull TimeUnit paramTimeUnit)
  {
    throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
  }
  
  public void store(@NonNull ResultStore paramResultStore, int paramInt)
  {
    throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
  }
  
  @NonNull
  public <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> paramResultTransform)
  {
    throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
  }
  
  public void zza(@NonNull PendingResult.zza paramzza)
  {
    throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
  }
  
  public void zzfB(int paramInt)
  {
    throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
  }
  
  @Nullable
  public Integer zzxe()
  {
    throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
  }
}


/* Location:              /home/evan/Downloads/fugu-opr2.170623.027-factory-d4be396e/fugu-opr2.170623.027/image-fugu-opr2.170623.027/TVLauncher/TVLauncher/TVLauncher-dex2jar.jar!/com/google/android/gms/internal/zzaag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */