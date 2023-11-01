<?php $__env->startSection('content'); ?>

<div class="container container-form">
    <div class="heading">
        <a href="<?php echo e(route('registo-estudante')); ?>" class="non-active">Estudante</a>
        <a href="<?php echo e(route('registo-instituicao')); ?>" class="active">Instituição</a>
    </div>
    <div class="formulario">
        <div class="row">
            <div class="col-lg-7 form">
                <form action="">
                    <h2>Registo Instituição</h2>
                    <div class="row form-group">
                        <div class="col-xl-8">
                            <div class="form-group form-input">
                                <label for="nome">Nome</label>
                                <input type="text" class="form-control" id="nome" name="nome" placeholder="Nome da instituição" required>
                            </div>
                        </div>
                        <div class="col-xl-4">
                            <div class="form-group form-input">
                                <label for="nif">NIF</label>
                                <input type="text" class="form-control" id="nif" name="nif" placeholder="NIF" required>
                            </div>
                        </div>
                    </div>
                    
                    <div class="form-group form-margin">
                        <label>Tipo</label>
                        <div class="form-radio">
                            <div class="form-check">
                                <input type="radio" class="form-check-input" id="escola" name="tipo" value="Escola">
                                <label class="form-check-label" for="escola" style="
                                font-weight: 500;">Escola</label>
                            </div>
                            <div class="form-check">
                                <input type="radio" class="form-check-input" id="agrupamento" name="tipo" value="Agrupamento">
                                <label class="form-check-label" for="agrupamento" style="
                                font-weight: 500;">Agrupamento</label>
                            </div>
                            <div class="form-check">
                                <input type="radio" class="form-check-input" id="empresa" name="tipo" value="Empresa">
                                <label class="form-check-label" for="empresa" style="
                                font-weight: 500;">Empresa</label>
                            </div>
                        </div>
                    </div>

                    <br>
                    <div class="form-group form-margin form-input">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" id="email" name="email" placeholder="Email" required>
                    </div>

                    <div class="form-group form-margin form-input">
                        <label for="password">Password</label>
                        <input type="password" class="form-control" id="password" name="password" placeholder="Password" required>
                    </div>

                    <div class="form-group form-margin form-input">
                        <label for="confirmarPassword">Confirmar Password</label>
                        <input type="password" class="form-control" id="confirmarPassword" name="confirmarPassword" placeholder="Confirmar password" required>
                    </div>

                    <br>
                    <div class="form-check form-group form-margin termos">
                        <input type="checkbox" class="form-check-input" id="aceitarTermos" name="aceitarTermos" required>
                        <label class="form-check-label" for="aceitarTermos">Aceito os termos e condições</label>
                    </div>

                    <button class="button-link form-margin">Submeter</button>
                </form>
            </div>
            <div class="col-lg-5 section">
                <h3>Já se encontra registado?</h3>
                <a class="button-link" href="<?php echo e(route('login')); ?>">Faça o login</a>
            </div>
        </div>
    </div>
</div>


        
<?php $__env->stopSection(); ?>
<?php echo $__env->make('layouts.main_layout', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\Users\hugol\Desktop\Programação\FrontEnd-Cesae\Projeto\project\resources\views/registo-instituicao.blade.php ENDPATH**/ ?>