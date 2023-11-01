<?php $__env->startSection('content'); ?>

<div class="container container-form">
    <div class="formulario">
        <div class="row">
            <div class="col-lg-7 form">
                <form action="<?php echo e(route('login_submit')); ?>" method="POST" class="form-login">
                    <?php echo csrf_field(); ?>
                    <h2>Login</h2>
                    <div class="row form-group">
                            <div class="form-group">
                                <label for="email">Email</label>
                                <input type="text" class="form-control" id="email" name="email" placeholder="Email" value="<?php echo e(old('email')); ?>">
                                <?php $__errorArgs = ['email'];
$__bag = $errors->getBag($__errorArgs[1] ?? 'default');
if ($__bag->has($__errorArgs[0])) :
if (isset($message)) { $__messageOriginal = $message; }
$message = $__bag->first($__errorArgs[0]); ?>
                                    
                                    <div class="text-danger"><?php echo e($errors->get('email')[0]); ?></div>
                                <?php unset($message);
if (isset($__messageOriginal)) { $message = $__messageOriginal; }
endif;
unset($__errorArgs, $__bag); ?>
                            </div>
                            <div class="form-group">
                                <label for="password">Password</label>
                                <input type="password" class="form-control" id="password" name="password" placeholder="Password" value="<?php echo e(old('password')); ?>">
                                <?php $__errorArgs = ['password'];
$__bag = $errors->getBag($__errorArgs[1] ?? 'default');
if ($__bag->has($__errorArgs[0])) :
if (isset($message)) { $__messageOriginal = $message; }
$message = $__bag->first($__errorArgs[0]); ?>
                                
                                    <div class="text-danger"><?php echo e($errors->get('password')[0]); ?></div>
                                <?php unset($message);
if (isset($__messageOriginal)) { $message = $__messageOriginal; }
endif;
unset($__errorArgs, $__bag); ?>
                            </div>
                    </div>
                    <div class="form-recup-pw">
                        <a href=""><p>Recuperar palavra-passe<p></a>
                    </div>
                    <button class="button-link form-margin">Entrar</button>
                    <?php if(session()->has('login_error')): ?>
                    <div class="text-danger text-center p-3">
                        <?php echo e(session()->get('login_error')); ?>

                    </div>
                    <?php endif; ?>
                </form>
            </div>
            <div class="col-lg-5 section">
                <h3>Ainda não tem registo?</h3>
                <a class="button-link" href="<?php echo e(route('registo-estudante')); ?>">Faça o registo</a>
            </div>

        </div>
    </div>
</div>



 
<?php $__env->stopSection(); ?>
<?php echo $__env->make('layouts.main_layout', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\Users\hugol\Desktop\Programação\FrontEnd-Cesae\Projeto\project\resources\views/login.blade.php ENDPATH**/ ?>